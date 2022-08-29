package com.techietaught.springActuatorDemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techietaught.springActuatorDemo.model.Order;
import com.techietaught.springActuatorDemo.repository.OrderProcessRepository;

@Service
public class OrderProcessServiceImpl implements OrderProcessService {

	@Autowired
	private OrderProcessRepository orderProcessRepository;
	
	@Override
	public Order createOrder(Order order) throws Exception {
		return orderProcessRepository.save(order);
	}
	
	@Override
	public List<Order> createBulkOrder(List<Order> order) throws Exception {
		return orderProcessRepository.saveAll(order);
	}
	
	@Override
	public List<Order> fetchAllOrders() throws Exception {
		return orderProcessRepository.findAll();
	}
	
	@Override
	public Order fetchOrderByOrderId(String orderId) throws Exception {
	 Optional<Order> order = orderProcessRepository.findByOrderId(orderId);
		return order.orElse(new Order());
	}

}
