package com.do1.template.single;

/**
 * 
 * 单例模式 懒汉
 * @author ydy
 * */
public class Singleton {
	private int id=0;
	private String name;
	private static volatile Singleton singleton;
	private  Singleton() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static Singleton test() {
		if(singleton==null) {
			singleton=new Singleton();
		}
		return singleton;
	}
	/**
	 * 获取对象
	 * */
	public static Singleton getSingleton() {
		if(singleton==null) {
			synchronized (Singleton.class) {
				if(singleton==null) {
					Singleton singletonTemp=new Singleton();
					singletonTemp.id=1;
					singletonTemp.name="abc";
					
					singleton=singletonTemp;
					
					
				}
				
				return singleton;
			}
		}else {
			return singleton;
		}
	}
	
	
	
	
	
	

}
