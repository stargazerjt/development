package com.my.research.development.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.my.research.development.model.Supplier;
import com.my.research.development.repo.SupplierRepository;

@RestController
public class HelloController {
	@Autowired
	SupplierRepository suppRepo;

	@GetMapping("/")
	public String index() {
		List<Supplier> supp= suppRepo.findAll();
		
		if(supp.isEmpty())
			return "GG";
		else
			return "Greetings from Spring Boot boot!";
	}

}