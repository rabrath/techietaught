package com.techietaught.prometheusDemo.service;

import java.util.List;

import com.techietaught.prometheusDemo.model.Order;

public interface OrderProcessService {

	Order createOrder(Order order) throws Exception;
	
	List<Order> createBulkOrder(List<Order> order) throws Exception;
	
	List<Order> fetchAllOrders() throws Exception;
	
	Order fetchOrderByOrderId(String orderId) throws Exception;
	
}
