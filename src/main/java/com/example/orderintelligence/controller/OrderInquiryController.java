package com.example.orderintelligence.controller;

import com.example.orderintelligence.model.OrderInquiryResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.orderintelligence.model.OrderInquiryRequest;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderInquiryController {

        @PostMapping("/inquiries")
        public OrderInquiryResponse submitInquiry(@RequestBody OrderInquiryRequest request){
            return new OrderInquiryResponse("I can help with other questions. AI is not connected yet.");
        }
}


