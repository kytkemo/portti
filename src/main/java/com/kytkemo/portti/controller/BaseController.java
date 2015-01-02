package com.kytkemo.portti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public final class BaseController {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String getRoot() {

        return "index";
    }
}
