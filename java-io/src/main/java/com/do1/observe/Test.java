package com.do1.observe;

public class Test {
	public static void main(String[] args) {
		MyContext myContext=new MyContext();
		Listener listener=new DefaultListener();
		myContext.addListener(listener);
		myContext.setName("碧桂园");
		myContext.setName("万科");
	}

}
