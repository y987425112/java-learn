package com.do1.observe;
/**
 * 属性监听器
 * @author ydy
 * */
public interface Listener {

	/**
	 * @param oldValue 旧值
	 * @param value 值
	 * */
	public void editAttr(String oldValue,String value);
}
