package com.do1.test;

import com.do1.entry.Bread;
import com.do1.template.BreadProdTempalteMy;
import com.do1.template.BreadProdTemplate;

/**
 * 模板测试
 * */
public class Test02 {
	public static void main(String[] args) {
		BreadProdTemplate prodTemplate=new BreadProdTempalteMy();
		Bread prodBread = prodTemplate.prodBread();
		System.out.println(prodBread.isCanEat());
	}

}
