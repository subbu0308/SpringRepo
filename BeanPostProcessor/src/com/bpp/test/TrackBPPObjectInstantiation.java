package com.bpp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.bpp.beans.Ebook;
import com.bpp.beans.TrackBeanPostProcessor;
import com.bpp.beans.TrackInstances;

public class TrackBPPObjectInstantiation {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/bpp/commons/application-context.xml"));
		System.out.println("CREATED INMEMORY METADATA");
		BeanPostProcessor bpp = factory.getBean("trackBPP", BeanPostProcessor.class);
		System.out.println("Found TrackBeanPostProcessor");
		((ConfigurableListableBeanFactory)factory).addBeanPostProcessor(bpp);
		System.out.println("Add bpp to beanfactory");
		Ebook eb = factory.getBean("ebook", Ebook.class);		
		System.out.println(eb);
		System.out.println("Number of objects : "+ TrackInstances.getCounter());
	}

}
