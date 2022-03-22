package com.pizza.data.repository;


import com.pizza.data.entity.pizza.PizzaEntity;
import com.pizza.remote.rest.dto.response.PizzaDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPizzaRepository extends JpaRepository<PizzaEntity, Integer> {

}
