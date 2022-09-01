package com.techietaught.prometheusDemo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.techietaught.prometheusDemo.model.Order;
import com.techietaught.prometheusDemo.service.OrderProcessService;

@RestController
public class OrderProcessController {
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private OrderProcessService orderProcessService;
	
	@PostMapping("/create-order")
	public ResponseEntity<Order> createOrder(@RequestBody Order order) throws Exception {
		order = orderProcessService.createOrder(order);
		log.info("Created single order successfully...");
		return ResponseEntity.ok(order);
	}
	
	@PostMapping("/create-bulk-order")
	public ResponseEntity<List<Order>> createBulkOrder(@RequestBody List<Order> orders) throws Exception {
		orders = orderProcessService.createBulkOrder(orders);
		log.info("Created bulk order successfully...");
		return ResponseEntity.ok(orders);
	}
	
	@GetMapping("/orders")
	public ResponseEntity<List<Order>> fetchAllOrders() throws Exception{
		List<Order> orders = orderProcessService.fetchAllOrders();
		log.info("Fetched all available orders successfully...");
		return ResponseEntity.ok(orders);
	}
	
	@GetMapping("/order/{orderId}")
	public ResponseEntity<Order> fetchOrderByOrderId(@PathVariable String orderId) throws Exception{
		Order order = orderProcessService.fetchOrderByOrderId(orderId);
		log.info("Fetched order by orderId successfully...");
		return ResponseEntity.ok(order);
	}

}
