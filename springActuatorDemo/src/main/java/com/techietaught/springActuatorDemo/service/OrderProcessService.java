package com.techietaught.springActuatorDemo.service;

import java.util.List;

import com.techietaught.springActuatorDemo.model.Order;

public interface OrderProcessService {

	Order createOrder(Order order) throws Exception;
	
	List<Order> createBulkOrder(List<Order> order) throws Exception;
	
	List<Order> fetchAllOrders() throws Exception;
	
	Order fetchOrderByOrderId(String orderId) throws Exception;
	
}
