package com.do1.entry;

/**
 * 面包
 * @author ydy
 * */
public class Bread {
	
	/**面粉*/
	private String flour;
	/**水*/
	private boolean water=false;
	/**加热*/
	private boolean heating=false;
	/**
	 * 加面粉
	 * */
	public void setFlour(String flour) {
		this.flour = flour;
	}
	public void setWater(boolean water) {
		this.water = water;
	}
	public void setHeating(boolean heating) {
		this.heating = heating;
	}
	
	/**
	 * 是否可以吃
	 * */
	public boolean isCanEat() {
		if(flour!=null&&water&&heating) {
			return true;
		}else
			return false;
	}
	
	
	

}
