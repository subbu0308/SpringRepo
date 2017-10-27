package com.bpp.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class TrackBeanPostProcessor implements BeanPostProcessor{
	

	@Override
	public Object postProcessBeforeInitialization(Object obj, String beanName) throws BeansException {
		
		return obj;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object obj, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		return TrackInstances.increment();
	}
	
	

}
