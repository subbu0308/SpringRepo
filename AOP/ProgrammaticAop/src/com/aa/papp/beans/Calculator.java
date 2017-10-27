package com.aa.papp.beans;/** around advice programmatic approach **/

/**
 * AOP meant for applying cross cutting logics across multiple class 
 * with in an application, if not both primary and secondary will get
 * tightly coupled.
 * ** Principles of AOP **
 * Aspect -- Piece of code cross cutting logic
 * Advice -- which can be advice to apply the aspect
 * JoinPoints -- Places in the target class, where we can advice to apply aspect
 * PointCuts -- Collection of join point where we applyed the Aspect	 * 
 * Weaving -- Combining the Target and the Advice class.
 * Target -- Classes in which the Join Points can be together
 * Proxy - The outcome of Weaving is nothing but Proxy. (contains Target and Advice)
 * 
 * Advices is of 4 types Befor, After, Around, ThrowableAdvice
 */

public class Calculator {
	
	public int add(int a, int b) {
		
		return a+b;
	}

	@Override
	public String toString() {
		return "Calculator []";
	}

	
	
}