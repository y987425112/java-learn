package com.ydy.stream.entity;

public class UserPo {
	
	private static String className="UserPo";
	
	private Integer id;
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public static String getClassName() {
		return className;
		
	}
	

}
