package com.techietaught.springActuatorDemo.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.techietaught.springActuatorDemo.model.Order;

@Repository
public interface OrderProcessRepository extends MongoRepository<Order, String> {

	Optional<Order>  findByOrderId(String orderId);
}
