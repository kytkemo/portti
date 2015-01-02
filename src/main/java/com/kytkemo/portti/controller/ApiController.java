package com.kytkemo.portti.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public final class ApiController {

    @RequestMapping(method = RequestMethod.GET, value = "secret", produces = "application/json")
    public Map<String, String> getSecret() {

        Map<String, String> secret = new HashMap<>();
        secret.put("secret", "42");

        return secret;
    }
}
