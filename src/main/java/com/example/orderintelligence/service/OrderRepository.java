package com.example.orderintelligence.service;

import com.example.orderintelligence.model.Order;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.Optional;

public class OrderRepository {
    private final Map<String, Order> orders = Map.of("42", new Order("42", "Alice John", "SHIPPED", "2026-05-20"),
            "43", new Order("43", "Alice John", "SHIPPED", "2026-05-20"),
            "44", new Order("44", "Bob Smith", "PROCESSING", "2026-05-22"),
            "45", new Order("45", "Carol White", "DELIVERED", "2026-05-15"),
            "100", new Order("100", "Emma Davis", "SHIPPED", "N/A")
    );

    public Optional<Order> findById(String orderId){
        return Optional.ofNullable(orders.get(orderId));
    }
}
