package com.ezen.weather.weather;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @GetMapping("/index")
    @ResponseBody
    public String index() {
        return "index";
    }
    //111111

}
