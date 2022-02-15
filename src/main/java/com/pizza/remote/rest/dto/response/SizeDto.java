package com.pizza.remote.rest.dto.response;

import java.math.BigDecimal;

public class SizeDto {
    private Integer id;
    private String size;
    private BigDecimal price;

    public SizeDto() {
    }

    public SizeDto(Integer id, String size, BigDecimal price) {
        this.id = id;
        this.size = size;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }
    public String getSize() {
        return size;
    }
    public BigDecimal getPrice() {
        return price;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
