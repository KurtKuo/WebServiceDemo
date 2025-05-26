package com.example.richbank.endpoint;

import com.example.richbank.ws.querySerGroup.QuerySerGroup;
import com.example.richbank.ws.querySerGroup.QuerySerGroupDataType;
import com.example.richbank.ws.querySerGroup.QuerySerGroupGroupType;
import com.example.richbank.ws.querySerGroup.QuerySerGroupMegaSilverType;
import com.example.richbank.ws.querySerGroup.QuerySerGroupResponse;
import com.example.richbank.ws.querySerGroup.QuerySerGroupResponseType;
import com.example.richbank.ws.querySerGroup.QuerySerGroupResultType;
import com.example.richbank.init.InitDataRichbankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.List;

@Endpoint
public class RichbankEndpoint {
    
    private static final String NAMESPACE_URI = "http://richbank.com.example.richbank/";
    
    @Autowired
    private InitDataRichbankService initDataRichbankService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "QuerySerGroup")
    @ResponsePayload
    public QuerySerGroupResponse getQuerySerGroupDataByGroupID(@RequestPayload QuerySerGroup request) throws Exception {
        List<QuerySerGroupDataType> groupDataTypes = initDataRichbankService.findByGroupID(request.getTxSeq());
        QuerySerGroupResponseType responseType = initDataRichbankService.initResponseTypeData();

        QuerySerGroupResponseType responseJaxb = new QuerySerGroupResponseType();
        responseJaxb.setCode(responseType.getCode());
        responseJaxb.setDesc(responseType.getDesc());
        responseJaxb.setTxSeq(responseType.getTxSeq());
        responseJaxb.setDateTime(responseType.getDateTime());

        QuerySerGroupGroupType groupJaxb = new QuerySerGroupGroupType();
        groupJaxb.getData().addAll(groupDataTypes);

        QuerySerGroupMegaSilverType megaSilver = new QuerySerGroupMegaSilverType();
        megaSilver.setResponse(responseJaxb);
        megaSilver.setGroup(groupJaxb);

        QuerySerGroupResultType result = new QuerySerGroupResultType();
        result.setMegaSilver(megaSilver);

        QuerySerGroupResponse response = new QuerySerGroupResponse();
        response.setQuerySerGroupResult(result);

        return response;
    }
}
