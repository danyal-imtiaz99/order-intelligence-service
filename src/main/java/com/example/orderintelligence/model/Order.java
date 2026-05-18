package com.example.orderintelligence.model;

public record Order (String orderId,
        String customerId,
        String status,
        String estimatedDelivery) { }

