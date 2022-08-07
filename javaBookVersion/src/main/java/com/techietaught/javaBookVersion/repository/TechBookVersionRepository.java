package com.techietaught.javaBookVersion.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.techietaught.javaBookVersion.model.TechBookVersion;

@Repository
public interface TechBookVersionRepository extends MongoRepository<TechBookVersion, String> {

	Optional<List<TechBookVersion>> findByVersionedTechBookId(String id);
	
}
