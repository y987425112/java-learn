package com.do1;

import com.do1.entry.Bread;

/**
 * 面包生产
 * @author ydy
 * */
public abstract class BreadProd {


	/**加水*/
	protected void addWater(Bread bread) {
		bread.setWater(true);
	}
	
	/**
	 * 加热
	 * */
	protected void heating(Bread bread) {
		bread.setHeating(true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
//	/**获取面粉*/
//	protected abstract String getFlour();
//
//	
//	public void prod() {
//		Bread bread=new Bread();
//		String flour = getFlour();
//		bread.setFlour(flour);
//		addWater(bread);
//		heating(bread);
//		
//		System.out.println("是否可以吃:"+bread.isCanEat());
//		
//		
//		
//		
//	}
	
}
