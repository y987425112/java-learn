package com.do1.observe;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 默认的容器监听器
 * @author ydy
 * */
public class DefaultListener  implements Listener{

	private AtomicInteger count=new AtomicInteger(0);
	@Override
	public void editAttr(String oldValue, String value) {
		// TODO Auto-generated method stub
		System.out.println("DefaultListener------------");
		System.out.println("修改次数:"+count.incrementAndGet());
		
	}

}
