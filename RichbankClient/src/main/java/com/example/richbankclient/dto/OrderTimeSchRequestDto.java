package com.example.richbankclient.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderTimeSchRequestDto {
    private String txSeq;
    private String WSID;
    private String id;
    private String branch;
    private String date;
    private String orderDate;
}