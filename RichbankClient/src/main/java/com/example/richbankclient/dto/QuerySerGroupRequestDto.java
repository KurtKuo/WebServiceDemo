package com.example.richbankclient.dto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuerySerGroupRequestDto {
    private String txSeq;
    private String WSID;
    private String branch;
}
