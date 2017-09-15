package com.dog.SpringReadWrite;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dog.SpringReadWrite.service.BaseService;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{	
	BaseService baseService=null;
	
	public AppTest(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/spring-service.xml");
		baseService=(BaseService) ctx.getBean("baseService");	
	}
	
	@org.junit.Test
	public void testAccount(){
		
		List list=baseService.findAccountList();
		System.out.println(list.size());
	}
	
	@Test
	public void testSaveAccount(){
		baseService.saveAccount();
	}
}
