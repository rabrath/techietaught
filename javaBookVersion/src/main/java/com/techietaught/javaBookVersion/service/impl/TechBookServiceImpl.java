package com.techietaught.javaBookVersion.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.techietaught.javaBookVersion.model.TechBook;
import com.techietaught.javaBookVersion.repository.TechBookRepository;
import com.techietaught.javaBookVersion.service.TechBookService;

@Service
public class TechBookServiceImpl implements TechBookService {

	@Autowired
	private TechBookRepository repository;
	
	@Override
	public TechBook createBook(TechBook techBook) throws Exception {
		techBook = repository.save(techBook);
		return techBook;
		
	}

	@Override
	public TechBook updateBook(TechBook techBook) throws Exception {
		techBook = repository.save(techBook);
		return techBook;
	}

}
