package com.ydy.stream;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class LamTest {
	
	//Consumer
	private static void test01() {
		Consumer<String> consumer=e->{
			System.out.println(e);
		};
		consumer.accept("123");
	}
	
	private static void test02() {
		Supplier<String> supplier=()->{
			return "123";
		};
		
	}
	
	public static void main(String[] args) {
		test01();
	}

}
