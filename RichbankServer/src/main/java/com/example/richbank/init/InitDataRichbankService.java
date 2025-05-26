package com.example.richbank.init;


import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import com.example.richbank.request.querySerGroup.QuerySerGroupDataType;
import com.example.richbank.request.querySerGroup.QuerySerGroupResponseType;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class InitDataRichbankService {

    private static final  List<QuerySerGroupDataType> groupDatas = new ArrayList<>();

    /**
     * 初始化模擬資料
     */
    @PostConstruct
    public void initGroupData() {
        groupDatas.add(buildData("101", "開戶/各項申請"));
        groupDatas.add(buildData("101", "開戶/各項申請1"));
        groupDatas.add(buildData("101", "開戶/各項申請2"));
        groupDatas.add(buildData("102", "臺幣收付轉帳"));
        groupDatas.add(buildData("103", "外匯業務(含黃金)"));
        groupDatas.add(buildData("104", "理財服務"));
        groupDatas.add(buildData("105", "證券服務"));
        groupDatas.add(buildData("106", "友善服務"));
    }

    /**
     * 建立單筆預約資料
     */
    private QuerySerGroupDataType buildData(String groupID, String name) {
    	QuerySerGroupDataType d = new QuerySerGroupDataType();
        d.setGroupID(groupID);
        d.setName(name);
        return d;
    }

    /**
     * 取得特定 groupID 的資料（假設 groupID 是唯一標識）
     */
    public List<QuerySerGroupDataType> findByGroupID(String groupID) {
        return groupDatas.stream()
                .filter(d -> d.getGroupID().equals(groupID))
                .collect(Collectors.toList());
    }

    /**
     * 取得全部資料（測試用）
     */
    public List<QuerySerGroupDataType> findAllData() {
        return new ArrayList<>(groupDatas);
    }
    
    /**
     * 初始化模擬資料
     */
    @PostConstruct
    public QuerySerGroupResponseType initResponseTypeData() {
    	QuerySerGroupResponseType rsType = new QuerySerGroupResponseType();
    	rsType.setCode("0000");
    	rsType.setDesc("Success");
    	rsType.setTxSeq("00005904");
    	rsType.setDateTime("2025/05/02 05:04:47.524");
    	return rsType;
    }
    
}
