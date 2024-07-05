package com.my.research.development.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.my.research.development.model.Storage;

public interface StorageRepository extends MongoRepository<Storage, String> {

	@Query("name:'?0'")
	Storage findByName(String name);
}
