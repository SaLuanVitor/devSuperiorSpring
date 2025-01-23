package com.devsuperior.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.entities.Order;
import com.devsuperior.services.OrderService;

@SpringBootApplication(scanBasePackages = "com.devsuperior")
public class OrderApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1, 1000.0, 10.0);

		System.out.println("Pedido código: " + order.getCode());
		System.out.println("Valor total: R$ " + orderService.orderCost(order));
	}
}
