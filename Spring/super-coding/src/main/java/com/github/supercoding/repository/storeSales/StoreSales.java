package com.github.supercoding.repository.storeSales;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString
@Builder
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
}




