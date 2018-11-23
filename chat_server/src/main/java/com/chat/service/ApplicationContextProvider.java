package com.chat.service;


import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
/**
 * 设置Spring的上下文
 * @author Administrator
 *
 */
@Component
public class ApplicationContextProvider implements ApplicationContextAware{
	
	private static ApplicationContext context;
	
	public ApplicationContextProvider() {
		
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		context = applicationContext;
	}
	
	public static <T> T getBean(String name,Class<T> aClass) {
		return context.getBean(name,aClass);
	}
	
	public static Object getBean(String name) {
		return context.getBean(name);
	}
	
	public static <T> T getBean(Class<T> aClass) {
		return context.getBean(aClass);
	}
	

}
