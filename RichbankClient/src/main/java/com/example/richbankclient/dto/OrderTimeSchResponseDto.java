package com.example.richbankclient.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OrderTimeSchResponseDto {
    private MegaSilver megaSilver;

    @Getter
    @Setter
    public static class MegaSilver {
        private Response response;
        private Group group;
    }

    @Getter
    @Setter
    public static class Response {
        private String code;
        private String desc;
        private String txSeq;
        private String dateTime;
        private int over;
    }

    @Getter
    @Setter
    public static class Group {
        private List<Data> data;
    }

    @Getter
    @Setter
    public static class Data {
        private String orderDate;
        private String orderSTime;
        private String orderETime;
        private int currentCnt;
        private int maxCnt;
    }
}