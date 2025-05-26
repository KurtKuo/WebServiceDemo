package com.example.richbankclient;

import com.example.richbankclient.client.QuerySerGroupClient;
import com.example.richbankclient.dto.QuerySerGroupRequestDto;
import com.example.richbankclient.dto.QuerySerGroupResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SoapTestRunner implements CommandLineRunner {

    @Autowired
    private QuerySerGroupClient client;

    @Override
    public void run(String... args) {
        System.out.println("⚙️ SoapTestRunner 開始執行...");

        QuerySerGroupRequestDto reqDto = new QuerySerGroupRequestDto();
        reqDto.setTxSeq("101");
        reqDto.setWSID("99990000");
        reqDto.setBranch("0998");

        QuerySerGroupResponseDto resDto = client.call(reqDto);

        System.out.println("收到回應：" + resDto);
    }
}
