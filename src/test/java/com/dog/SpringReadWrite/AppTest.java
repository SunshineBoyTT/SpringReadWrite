package com.dog.SpringReadWrite;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.dog.SpringReadWrite.entity.Account;
import com.dog.SpringReadWrite.service.BaseService;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{	
	@org.junit.Test
	public void testAccount(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/spring-service.xml");
		BaseService baseService=(BaseService) ctx.getBean("baseService");
		List list=baseService.findAccountList();
		System.out.println(list.size());
	}
	
}
