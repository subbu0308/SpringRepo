package com.aa.papp.beans;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import com.aa.app.utils.Cache;

public class CacheAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		System.out.println("entered into cache invoke");
		String methodName = null;
		Cache cache = null;
		Object[] arg = null;
		//int sum =0;
		
		methodName = methodInvocation.getMethod().getName();
		arg = methodInvocation.getArguments();
		
		String key = methodName+"(";
		for(int i=0; i<arg.length; i++){
			if(i==0) {
				key = key+arg[i];
				
				//System.out.println(arg[i]);
				continue;
			}
			key = key+","+arg[i]+")";	
			
			System.out.println("Key is "+key);
	
		}		
		cache = Cache.getInstance();
		if(cache.containsKey(key)) {
			System.out.println("Data available in cache, so returning from cache");
			cache.get(key);
		}
		else {	
			System.out.println("Data not available in cache, so putting 1st time");
			Object ob = methodInvocation.proceed();			
			cache.put(key,ob );
			return ob;
		}
		Object ob = methodInvocation.proceed();
		return ob;
	}
	

}
