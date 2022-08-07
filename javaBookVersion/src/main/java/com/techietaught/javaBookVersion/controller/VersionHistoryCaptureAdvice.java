package com.techietaught.javaBookVersion.controller;

import java.util.Optional;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.techietaught.javaBookVersion.annotation.MaintainVersionHistory;
import com.techietaught.javaBookVersion.model.BaseEntity;
import com.techietaught.javaBookVersion.model.TechBookVersion;
import com.techietaught.javaBookVersion.model.TechBookVersionHead;
import com.techietaught.javaBookVersion.repository.TechBookVersionHeadRepository;
import com.techietaught.javaBookVersion.repository.TechBookVersionRepository;


@Aspect
@Component
public class VersionHistoryCaptureAdvice {

	private static final int VERSION_NO_HISTORY = 0;
	@Autowired
	private TechBookVersionRepository bookVersionRepository;
	@Autowired
	private TechBookVersionHeadRepository bookVersionHeadRepository;
	

	@AfterReturning(value = "execution(public * save(..)) && this(org.springframework.data.repository.CrudRepository)", returning = "responseEntity")
	public void onSave(JoinPoint jp, Object responseEntity) {
		
			BaseEntity entity = (BaseEntity) responseEntity;
			
			for (Class c : jp.getTarget().getClass().getInterfaces()) {
				
				if (c.isAnnotationPresent(MaintainVersionHistory.class) && CrudRepository.class.isAssignableFrom(c)) {
					
					Optional<TechBookVersionHead> entityHeadResult = bookVersionHeadRepository.findByVersionedTechBookId(entity.getId());
					TechBookVersionHead techBookVersionHead;
					
					if (entityHeadResult.isPresent()) {
						techBookVersionHead = entityHeadResult.get();
						techBookVersionHead.incrementVersionNumber();						
					} else {
						techBookVersionHead = new TechBookVersionHead(responseEntity.getClass().getName(), entity.getId(), VERSION_NO_HISTORY);
					}
					bookVersionHeadRepository.save(techBookVersionHead);
					TechBookVersion techBookVersion = new TechBookVersion(responseEntity.getClass().getName(), entity.getId(),
							techBookVersionHead.getHeadVersionNumber(), responseEntity);
					bookVersionRepository.save(techBookVersion);
					System.out.println(responseEntity);
				}
			}
		
	}
}
