package com.example.richbankclient.controller;

import com.example.richbankclient.client.QuerySerGroupClient;
import com.example.richbankclient.dto.OrderTimeSchRequestDto;
import com.example.richbankclient.dto.OrderTimeSchResponseDto;
import com.example.richbankclient.dto.QuerySerGroupRequestDto;
import com.example.richbankclient.dto.QuerySerGroupResponseDto;
import com.example.richbankclient.service.OrderTimeSchService;
import com.example.richbankclient.service.QuerySerGroupService;
import com.example.richbankclient.ws.querySerGroup.QuerySerGroup;
import com.example.richbankclient.ws.querySerGroup.QuerySerGroupResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/richbank")
public class SoapController {

    @Autowired
    private QuerySerGroupService querySerGroupService;

    @Autowired
    private OrderTimeSchService orderTimeSchService;

    @PostMapping("/querySerGroup")
    public QuerySerGroupResponseDto querySerGroup(@RequestBody QuerySerGroupRequestDto dto) {
        return querySerGroupService.query(dto);
    }

    @PostMapping("/orderTimeSch")
    public OrderTimeSchResponseDto orderTimeSch(@RequestBody OrderTimeSchRequestDto dto) {
        return orderTimeSchService.queryOrderTime(dto);
    }
}
