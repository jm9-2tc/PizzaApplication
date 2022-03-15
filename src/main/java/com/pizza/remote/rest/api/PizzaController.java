package com.pizza.remote.rest.api;

import com.pizza.remote.rest.dto.request.PizzaOrderDto;
import com.pizza.remote.rest.dto.request.UpdatePizzaDto;
import com.pizza.remote.rest.dto.response.PizzaDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequestMapping(value = "/api/v1/pizzas", produces = APPLICATION_JSON_VALUE)

public class PizzaController {

    @PostMapping
    public ResponseEntity<PizzaDto> addPizza(@RequestBody PizzaOrderDto pizzaOrderDto, @RequestHeader("Access-Token") String token) {
        return ResponseEntity.ok(null);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PizzaDto> updatePizza(@RequestBody UpdatePizzaDto updatePizzaDto, @RequestHeader("Access-Token") String token, @PathVariable("Id") Integer pizzaId) {
        return ResponseEntity.ok(null);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePizza(@PathVariable("id") Integer pizzaId, @RequestHeader("Access-Token") String token) {
        return ResponseEntity.ok().build();
    }
}
