package com.github.supercoding.repository.storeSales;

import java.util.Objects;

public class StoreSales {
    private Integer id;
    private String storeName;
    private Integer amount;

    // 생성자
    public StoreSales(Integer id, String storeName, Integer amount) {
        this.id = id;
        this.storeName = storeName;
        this.amount = amount;
    }

    // getter & setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    // equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StoreSales that)) return false;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}



