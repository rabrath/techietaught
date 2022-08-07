package com.techietaught.javaBookWithoutVersion.service;

import com.techietaught.javaBookWithoutVersion.model.TechBook;

public interface TechBookService {

	TechBook createBook(TechBook techBook) throws Exception;

	TechBook updateBook(TechBook techBook) throws Exception;
}
