package com.my.research.development.model;

import java.sql.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Supplier {
	@Id
	public ObjectId _id;
	
	public String name;
	public String regNo;
	public String email;
	public String telNo;
	public String address;
	public String createDt;
	public String updateDt;
	public String code;
	

}
