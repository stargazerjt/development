package com.my.research.development.model;

import java.sql.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Storage {
	@Id
	public ObjectId _id;
	
	public String type;
	public String name;
	public String measureUnit;
	public String measureNum;
	public String supplier;
	public String status;
	public Date expDt;
	public Date createDt;
	public Date updateDt;
	
}
