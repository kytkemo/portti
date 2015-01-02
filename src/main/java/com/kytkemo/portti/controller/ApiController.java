package com.kytkemo.portti.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("api")
public final class ApiController {

    @RequestMapping(method = RequestMethod.GET, value = "secret", produces = "application/json")
    @ResponseBody
    public Map<String, String> getSecret() {

        final Map<String, String> secret = new HashMap<>();

        secret.put("secret", "42");

        return secret;
    }
}
