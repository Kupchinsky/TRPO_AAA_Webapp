package ru.killer666.aaa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class HomePageController {
    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }
}

