package com.acme.springConf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.acme.order.HashMapOrderRepository;
import com.acme.order.OrderFactory;
import com.acme.order.OrderRepository;
import com.acme.order.delivery.BasicDeliveryTimeServiceImpl;
import com.acme.order.delivery.DeliveryTimeService;
import com.acme.order.notification.MailSender;
import com.acme.order.notification.SimpleMessageTemplateService;

@Configuration
public class AppConfig {

	@Bean
	public OrderFactory orderFactory() {
		return new OrderFactory();
	}

	@Bean
	public OrderRepository orderRepository() {
		return new HashMapOrderRepository();
	}

	@Bean
	public DeliveryTimeService deliveryTimeService(){
		return new BasicDeliveryTimeServiceImpl();
	}
	
	@Bean
	public SimpleMessageTemplateService simpleMessageTemplateService(){
		return new SimpleMessageTemplateService();
	}
	
	@Bean
	public MailSender mailSender(){
		return new MailSender();
	}
	
}
