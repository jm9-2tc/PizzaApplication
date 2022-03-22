package com.pizza.domain.mapper;

import com.pizza.data.entity.pizza.PizzaEntity;
import com.pizza.remote.rest.dto.request.AddPizzaDto;

public class PizzaMapper {
    private final SizeMapper sizeMapper;

    public PizzaMapper(SizeMapper sizeMapper) {
        this.sizeMapper = sizeMapper;
    }

    public PizzaEntity mapToPizzaEntity(AddPizzaDto addPizzaDto) {

    }
}
