package com.example.richbankclient.common;

import com.example.richbankclient.dto.OrderTimeSchResponseDto;
import com.example.richbankclient.dto.QuerySerGroupResponseDto;
import com.example.richbankclient.ws.orderTimeSch.OrderTimeSchResponse;
import com.example.richbankclient.ws.querySerGroup.QuerySerGroupResponse;

import java.util.ArrayList;
import java.util.List;

public class SoapToDtoMapper {

    public static QuerySerGroupResponseDto mapQuerySerGroupResponse(QuerySerGroupResponse soapResponse) {
        QuerySerGroupResponseDto dto = new QuerySerGroupResponseDto();

        var soapResult = soapResponse.getQuerySerGroupResult();
        var soapMegaSilver = soapResult.getMegaSilver();

        // 建立 MegaSilver
        QuerySerGroupResponseDto.MegaSilver megaSilver = new QuerySerGroupResponseDto.MegaSilver();

        // 建立 Response 並填值
        QuerySerGroupResponseDto.Response response = new QuerySerGroupResponseDto.Response();
        response.setCode(soapMegaSilver.getResponse().getCode());
        response.setDesc(soapMegaSilver.getResponse().getDesc());
        response.setTxSeq(soapMegaSilver.getResponse().getTxSeq());
        response.setDateTime(soapMegaSilver.getResponse().getDateTime());
        megaSilver.setResponse(response);

        // 建立 Group 和 Data 清單
        QuerySerGroupResponseDto.Group group = new QuerySerGroupResponseDto.Group();
        List<QuerySerGroupResponseDto.Data> dataList = new ArrayList<>();
        for (var soapData : soapMegaSilver.getGroup().getData()) {
            QuerySerGroupResponseDto.Data data = new QuerySerGroupResponseDto.Data();
            data.setGroupID(soapData.getGroupID());
            data.setName(soapData.getName());
            dataList.add(data);
        }
        group.setData(dataList);
        megaSilver.setGroup(group);

        // 設定 MegaSilver
        dto.setMegaSilver(megaSilver);

        return dto;
    }

    public static OrderTimeSchResponseDto mapOrderTimeSchResponse(OrderTimeSchResponse soapResponse) {
        OrderTimeSchResponseDto dto = new OrderTimeSchResponseDto();

        var soapResult = soapResponse.getOrderTimeSchResult();
        var soapMegaSilver = soapResult.getMegaSilver();

        // MegaSilver
        OrderTimeSchResponseDto.MegaSilver megaSilver = new OrderTimeSchResponseDto.MegaSilver();

        // Response
        OrderTimeSchResponseDto.Response response = new OrderTimeSchResponseDto.Response();
        response.setCode(soapMegaSilver.getResponse().getCode());
        response.setDesc(soapMegaSilver.getResponse().getDesc());
        response.setTxSeq(soapMegaSilver.getResponse().getTxSeq());
        response.setDateTime(soapMegaSilver.getResponse().getDateTime());
        response.setOver(soapMegaSilver.getResponse().getOver());
        megaSilver.setResponse(response);

        // Group & Data List
        OrderTimeSchResponseDto.Group group = new OrderTimeSchResponseDto.Group();
        List<OrderTimeSchResponseDto.Data> dataList = new ArrayList<>();

        for (var soapData : soapMegaSilver.getGroup().getData()) {
            OrderTimeSchResponseDto.Data data = new OrderTimeSchResponseDto.Data();
            data.setOrderDate(soapData.getOrderDate());
            data.setOrderSTime(soapData.getOrderSTime());
            data.setOrderETime(soapData.getOrderETime());
            data.setCurrentCnt(soapData.getCurrentCnt());
            data.setMaxCnt(soapData.getMaxCnt());
            dataList.add(data);
        }
        group.setData(dataList);
        megaSilver.setGroup(group);

        dto.setMegaSilver(megaSilver);

        return dto;
    }
}
