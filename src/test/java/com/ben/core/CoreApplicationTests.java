package com.ben.core;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ben.services.PaymentService;
import com.ben.services.PaymentServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
class CoreApplicationTests {
	
	@Autowired
	PaymentServiceImpl service;


	@Test
	public void testDependencyInjection()
	{
		assertNotNull(service.getPaymentDAO());
	}
}
