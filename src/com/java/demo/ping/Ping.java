package com.java.demo.ping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1")
public class Ping {
    @RequestMapping("/ping")
    public String ping() {
        return "/WEB-INF/jsp/ping.jsp";
        //return "It's ok !";
    }
}
