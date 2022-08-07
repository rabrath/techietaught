package com.techietaught.javaBookWithoutVersion.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.techietaught.javaBookWithoutVersion.model.TechBook;
import com.techietaught.javaBookWithoutVersion.repository.TechBookRepository;
import com.techietaught.javaBookWithoutVersion.service.TechBookService;

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
