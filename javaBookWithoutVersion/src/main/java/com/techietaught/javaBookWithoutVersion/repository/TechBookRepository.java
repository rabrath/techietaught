package com.techietaught.javaBookWithoutVersion.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.techietaught.javaBookWithoutVersion.model.TechBook;

public interface TechBookRepository extends MongoRepository<TechBook, String> {

}
