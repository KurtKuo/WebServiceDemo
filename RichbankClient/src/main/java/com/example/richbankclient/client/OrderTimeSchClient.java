package com.example.richbankclient.client;

import com.example.richbankclient.common.SoapToDtoMapper;
import com.example.richbankclient.dto.OrderTimeSchRequestDto;
import com.example.richbankclient.dto.OrderTimeSchResponseDto;
import com.example.richbankclient.ws.orderTimeSch.OrderTimeSch;
import com.example.richbankclient.ws.orderTimeSch.OrderTimeSchResponse;
import jakarta.xml.bind.JAXBElement;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;

@Component
public class OrderTimeSchClient {

    private final WebServiceTemplate webServiceTemplate;

    public OrderTimeSchClient(WebServiceTemplate webServiceTemplate) {
        this.webServiceTemplate = webServiceTemplate;
    }

    public OrderTimeSchResponseDto call(OrderTimeSchRequestDto dto) {
        OrderTimeSch request = new OrderTimeSch();
        request.setTxSeq(dto.getTxSeq());
        request.setWSID(dto.getWSID());
        request.setID(dto.getId()); // 注意大小寫
        request.setBranch(dto.getBranch());
        if (dto.getOrderDate() != null) {
            request.setOrderDate(dto.getOrderDate());
        }

        JAXBElement<OrderTimeSchResponse> response = (JAXBElement<OrderTimeSchResponse>)
                webServiceTemplate.marshalSendAndReceive("http://localhost:8060/richbankService", request);

        return SoapToDtoMapper.mapOrderTimeSchResponse(response.getValue());
    }
}