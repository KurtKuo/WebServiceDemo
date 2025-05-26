package com.example.richbankclient.service;

import com.example.richbankclient.client.QuerySerGroupClient;
import com.example.richbankclient.dto.QuerySerGroupRequestDto;
import com.example.richbankclient.dto.QuerySerGroupResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuerySerGroupService {

    @Autowired
    private QuerySerGroupClient client;

    public QuerySerGroupResponseDto query(QuerySerGroupRequestDto dto) {
        return client.call(dto);
    }
}
