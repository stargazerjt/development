package com.my.research.development.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.my.research.development.model.Supplier;

public interface SupplierRepository extends MongoRepository<Supplier, String> {

	@Query("code:'?0'")
	Supplier findByCode(String code);
}
