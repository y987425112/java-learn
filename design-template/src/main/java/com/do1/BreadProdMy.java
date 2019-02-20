package com.do1;

import com.do1.entry.Bread;

public class BreadProdMy extends BreadProd  {

	
	/**
	 * 生产面包
	 * */
	public Bread prodBread() {
		Bread bread=new Bread();
		//设置面粉
		bread.setFlour("高筋面");
		//加水
		addWater(bread);
		//加热
		heating(bread);
		return bread;
	}
	

}
