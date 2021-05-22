package com.homework.seventhhomework.controller;

import javax.annotation.security.RolesAllowed;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
public class RolesController {
    @GetMapping("/public/api")
    public String publicApi() {
        return "Welcome to the Spring Security!!!";
    }

    @GetMapping("/support/api")
    @RolesAllowed("ROLE_SUPPORT")
    public String supportApi(@AuthenticationPrincipal User user) {
        return getCurrentUser(user);
    }

    @GetMapping("/admin/api")
    @RolesAllowed("ROLE_ADMIN")
    public String adminApi(@AuthenticationPrincipal User user) {
        return getCurrentUser(user);
    }

    private String getCurrentUser(User user) {
        return user.getUsername() + ": " +  user.getAuthorities().stream().map(Object::toString).collect(Collectors.joining(" "));
    }
}
