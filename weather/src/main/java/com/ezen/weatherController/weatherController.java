package com.ezen.weatherController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class weatherController {
    @GetMapping("/weather")
    @ResponseBody
    public String weather() {
        return "웨더테스트";
    }

}
