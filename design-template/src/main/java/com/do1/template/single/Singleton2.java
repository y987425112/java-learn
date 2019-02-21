package com.do1.template.single;
/**
 * 
 * 单例模式 饿汉
 * @author ydy
 * */
public class Singleton2 {

	private int id=0;
	private String name="";
	private static Singleton2 singleton2=new Singleton2();
	private  Singleton2() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * 获取对象
	 * */
	public Singleton2 getSingleton2() {
		return singleton2;
	}
	
	
	
}
