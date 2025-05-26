package com.example.richbankclient.service;

import com.example.richbankclient.client.OrderTimeSchClient;
import com.example.richbankclient.dto.OrderTimeSchRequestDto;
import com.example.richbankclient.dto.OrderTimeSchResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderTimeSchService {

    @Autowired
    private OrderTimeSchClient client;

    public OrderTimeSchResponseDto queryOrderTime(OrderTimeSchRequestDto dto) {
        return client.call(dto);
    }
}
