package com.pizza.remote.rest.api;

import com.pizza.domain.model.OrderStatusType;
import com.pizza.remote.rest.dto.request.AddOrderDto;
import com.pizza.remote.rest.dto.request.UpdateOrderDto;
import com.pizza.remote.rest.dto.response.OrderCollectionDto;
import com.pizza.remote.rest.dto.response.OrderDto;
import com.pizza.remote.rest.dto.response.OrderStatusDto;
import com.pizza.remote.rest.dto.response.TokenDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequestMapping(value = "/api/v1/orders", produces = APPLICATION_JSON_VALUE)

public class OrderController {
    @PostMapping
    public ResponseEntity<TokenDto> addOrder(@RequestBody AddOrderDto addOrderDto) {
        //TokenDto tokenDto = addOrderService.addOrder(addOrderDto);
        return ResponseEntity.ok(null);
    }

    @GetMapping("/status/{token}")
    public ResponseEntity<OrderStatusDto> getStatus(@PathVariable("token")String token) {
        return ResponseEntity.ok(null);
    }

    @GetMapping
    public ResponseEntity<OrderCollectionDto> getOrders(@RequestParam("status") OrderStatusType orderStatus, @RequestHeader("Access-Token") String token) {
        return ResponseEntity.ok(null);
    }

    @DeleteMapping("/{order-id}")
    public ResponseEntity<Void> deleteOrders(@PathVariable("order-id") Integer orderId, @RequestParam("Access-Token") String token) {
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{order-id}")
    public ResponseEntity<OrderDto> putOrder(@RequestHeader("Access-Token") String token, @PathVariable("order-id") Integer orderId, @RequestBody UpdateOrderDto updateOrderDto) {
        return ResponseEntity.ok(null);
    }
}
