package com.homework.fourth_homework.Dto;

import java.math.BigDecimal;

public class Dto {
    public BigDecimal price;
    public Info info;

    public Dto() {
    }

    public Dto(BigDecimal price, Info info) {
        this.price = price;
        this.info = info;
    }
}
