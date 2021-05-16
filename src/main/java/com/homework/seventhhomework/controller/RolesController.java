package com.homework.seventhhomework.controller;

import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;

import jdk.jfr.Unsigned;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
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
    public String supportApi() {
        return getCurrentUser();
    }

    @GetMapping("/admin/api")
    @RolesAllowed("ROLE_ADMIN")
    public String adminApi() {
        return getCurrentUser();
    }

    private String getCurrentUser() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        return auth.getName() + ": " + auth.getAuthorities().stream().map(Object::toString).collect(Collectors.joining(" "));
    }
}
