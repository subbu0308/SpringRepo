package com.bpp.beans;

import java.util.concurrent.atomic.AtomicInteger;

public class TrackInstances{
	protected static AtomicInteger counter = new AtomicInteger(0);
	
	public static Object increment() {
		System.out.println("counter value is " + counter);
		return counter.getAndIncrement();
		
		
	}
	

	public static AtomicInteger getCounter() {
		return counter;
	}
	
	
	
}
