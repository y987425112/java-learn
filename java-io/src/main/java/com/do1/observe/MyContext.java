package com.do1.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * 运行环境上下文
 * @author ydy
 * */
public class MyContext {
	
	private String name="";
	private List<Listener> listeners=new ArrayList<>();//CopyOnWriteArrayList
	
	/**
	 * 添加监听器
	 * @param listener
	 * */
	public void addListener(Listener listener) {
		listeners.add(listener);
	}


	public String getName() {
		return name;
	}


	/***
	 * 设置容器名称
	 * @param name
	 * */
	public void setName(String name) {
		for(Listener listener:listeners) {
			try {
				
				listener.editAttr(this.name, name);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		this.name = name;
	}
	
	

}
