package com.pizza.domain.service;

import com.pizza.data.entity.pizza.PizzaEntity;
import com.pizza.data.repository.IPizzaRepository;
import com.pizza.domain.exception.UnauthorizedException;
import com.pizza.remote.rest.dto.request.AddPizzaDto;
import com.pizza.remote.rest.dto.response.PizzaDto;
import org.springframework.stereotype.Service;

@Service
public class PizzaService {
    private final IPizzaRepository pizzaRepository;

    public PizzaService(IPizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    public PizzaDto addPizza(AddPizzaDto addPizzaDto, String token) {
        if (!AuthorizationService.checkToken(token)) {
            throw new UnauthorizedException("Invalid access token.");
        }

        /*
        PizzaEntity pizzaEntity = new PizzaEntity();
        pizzaEntity.setName(addPizzaDto.getName());
        PizzaEntity savedPizzaEntity = pizzaRepository.save(pizzaEntity);
        */
    }

}
