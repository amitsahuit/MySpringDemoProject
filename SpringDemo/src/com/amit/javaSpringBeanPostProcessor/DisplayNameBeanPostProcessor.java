package com.amit.javaSpringBeanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object Bean, String beanName) throws BeansException {
		System.out.println("Inside post Process After Initialization. Name is: "+ beanName);
		return Bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object Bean, String beanName) throws BeansException {
		System.out.println("Inside post Process Before Initialization. Name is: "+ beanName);
		return Bean;
	}
	

}
