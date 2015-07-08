package com.acme.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.acme.springConf.AppConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={AppConfig.class})
public class springTest {

	/*private PizzaOrderServiceImpl pizzaOrderServicImple;
	private Customer customer1;*/	
	
	@Test
	public void testingMethod(){
		;
	}
}
