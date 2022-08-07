package com.techietaught.javaBookVersion.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.techietaught.javaBookVersion.annotation.MaintainVersionHistory;
import com.techietaught.javaBookVersion.model.TechBook;

@MaintainVersionHistory
@Repository
public interface TechBookRepository extends MongoRepository<TechBook, String> {

}
