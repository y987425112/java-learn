package com.do1.test;

import com.do1.BreadProdMy;
import com.do1.entry.Bread;

/**
 * 模板测试
 * @author ydy
 * */
public class Test01 {
	public static void main(String[] args) {
		//创建面包厂
		BreadProdMy breadProd=new BreadProdMy();
		//生产面包
		Bread prodBread = breadProd.prodBread();
		System.out.println(prodBread.isCanEat());
	}

}
