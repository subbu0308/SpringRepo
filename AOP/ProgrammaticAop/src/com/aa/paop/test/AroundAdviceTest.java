package com.aa.paop.test;


import org.springframework.aop.framework.ProxyFactory;

import com.aa.papp.beans.CacheAdvice;
import com.aa.papp.beans.Calculator;
import com.aa.papp.beans.LoggingAdvice;

public class AroundAdviceTest {

	public static void main(String[] args) {
		ProxyFactory factory = new ProxyFactory();
		factory.setTarget(new Calculator());
		factory.addAdvice(new CacheAdvice());
		factory.addAdvice(new LoggingAdvice());
		Calculator c = (Calculator) factory.getProxy();
		Calculator c1 = (Calculator) factory.getProxy();
		int sum = c.add(8, 20);
		int sum1 = c1.add(8, 20);
		System.out.println("First sum is " +sum);
		System.out.println("Second sum is " +sum1);
	} 		
		

	
	
	
	
}
