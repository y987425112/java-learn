package com.do1.template;

import com.do1.entry.Bread;

public abstract class BreadProdTemplate {
	/**加水*/
	private void addWater(Bread bread) {
		bread.setWater(true);
	}
	
	/**
	 * 加热
	 * */
	private void heating(Bread bread) {
		bread.setHeating(true);
	}
	
	/**
	 * 生产面包
	 * */
	public Bread prodBread() {
		Bread bread=new Bread();
		String flour = getFlour();
		//设置面粉
		bread.setFlour(flour);
		//加水
		addWater(bread);
		//加热
		heating(bread);
		return bread;
	}
	
	/**
	 * 获取面粉
	 * */
	protected abstract String getFlour();
	
	/**
	 * 添加糖
	 * */
	protected String getTang() {
		return null;
		
	}

}
