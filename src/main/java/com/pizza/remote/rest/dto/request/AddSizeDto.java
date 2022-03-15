package com.pizza.remote.rest.dto.request;

import com.pizza.remote.rest.dto.response.SizeDto;

import java.math.BigDecimal;

public class AddSizeDto {
    private SizeDto size;
    private BigDecimal price;

    public AddSizeDto() {}

    public AddSizeDto(SizeDto size, BigDecimal price) {
        this.size = size;
        this.price = price;
    }

    public SizeDto getSize() {
        return size;
    }

    public void setSize(SizeDto size) {
        this.size = size;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
