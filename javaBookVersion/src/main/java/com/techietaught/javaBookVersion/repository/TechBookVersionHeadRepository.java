package com.techietaught.javaBookVersion.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.techietaught.javaBookVersion.model.TechBookVersionHead;

@Repository
public interface TechBookVersionHeadRepository extends MongoRepository<TechBookVersionHead, String> {
	Optional<TechBookVersionHead>findByVersionedTechBookId(String id);
}
