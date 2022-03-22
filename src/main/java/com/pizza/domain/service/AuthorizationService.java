package com.pizza.domain.service;

public class AuthorizationService {
    public static boolean checkToken(String token) {
        return token != null && token.equals("x1v1");
    }
}
