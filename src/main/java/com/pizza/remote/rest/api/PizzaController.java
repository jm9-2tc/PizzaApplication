package com.pizza.remote.rest.api;

import com.pizza.remote.rest.dto.request.PizzaOrderDto;
import com.pizza.remote.rest.dto.response.PizzaDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class PizzaController {
    @PostMapping
    public ResponseEntity<PizzaDto> addPizza(@RequestBody PizzaOrderDto pizzaOrderDto, @RequestHeader("Access-Token") String token) {
        return ResponseEntity.ok(null);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PizzaDto> updatePizza(@RequestBody , @RequestHeader("Access-Token") String token, @PathVariable("Id") Integer pizzaId) {

    }
}
