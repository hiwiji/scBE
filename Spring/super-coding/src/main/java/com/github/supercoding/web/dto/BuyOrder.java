package com.github.supercoding.web.dto;

public class BuyOrder {
    private Integer itemId;
    private Integer itemNums;

    // 빈생성자 추가
    public BuyOrder() {
    }

    // getter
    public Integer getItemId() {
        return itemId;
    }

    public Integer getItemNums() {
        return itemNums;
    }
}
