package com.ydy.lamana;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author ydy
 * */
public class LamanaExample {
	
	private static void runnable() {
		Thread t=new Thread(()->
			System.out.println("123")
		);
		t.start();
	}
	
	private static void forEach() {
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.forEach(e->{
			System.out.println(e);
		});
	}
	
	private static void predicate() {
		 List list = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
		 filter(list, e-> e.startsWith("J"));
		
	}
	
	private static void predicate2() {
		List<String> list = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
		Predicate<String> p=e->e.startsWith("J");
		Predicate<String> p2=e->e.length()==4;
		list.stream().filter(p.and(p2)).forEach(e->System.out.println(e));
		
	}
	
	private static void filter(List<String> list,Predicate<String> p) {
		list.forEach(e->{
			p.test(e);
			System.out.println(e);
		});
	}
	
	private static void collect() {
		List<String> list = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
		;
		Map<Integer, List<String>> map = list.stream().collect(Collectors.groupingBy(String::length));
	}
	public static void main(String[] args) {
//		runnable();
//		forEach();
//		predicate();
		predicate2();
	}

}
