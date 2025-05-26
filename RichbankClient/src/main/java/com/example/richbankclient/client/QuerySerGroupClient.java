package com.example.richbankclient.client;

import com.example.richbankclient.common.SoapToDtoMapper;
import com.example.richbankclient.dto.QuerySerGroupRequestDto;
import com.example.richbankclient.dto.QuerySerGroupResponseDto;
import com.example.richbankclient.ws.querySerGroup.QuerySerGroup;
import com.example.richbankclient.ws.querySerGroup.QuerySerGroupResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;

@Component
public class QuerySerGroupClient {

    private final WebServiceTemplate webServiceTemplate;

    @Autowired
    public QuerySerGroupClient(WebServiceTemplate webServiceTemplate) {
        this.webServiceTemplate = webServiceTemplate;
    }

    public QuerySerGroupResponseDto call(QuerySerGroupRequestDto dto) {
        QuerySerGroup request = new QuerySerGroup();
        request.setTxSeq(dto.getTxSeq());
        request.setWSID(dto.getWSID());
        request.setBranch(dto.getBranch());

        QuerySerGroupResponse soapRes = (QuerySerGroupResponse) webServiceTemplate
                .marshalSendAndReceive("http://localhost:8060/richbankService", request);

        return SoapToDtoMapper.mapQuerySerGroupResponse(soapRes);
    }
}
