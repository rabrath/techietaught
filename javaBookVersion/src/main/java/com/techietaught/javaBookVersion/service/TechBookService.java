package com.techietaught.javaBookVersion.service;

import com.techietaught.javaBookVersion.model.TechBook;

public interface TechBookService {

	TechBook createBook(TechBook techBook) throws Exception;

	TechBook updateBook(TechBook techBook) throws Exception;
}
