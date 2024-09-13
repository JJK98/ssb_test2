package com.example.sbb_test2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/main")
    @ResponseBody
    public String main(){
        return "시험 두번째 시작!";
    }

    @GetMapping("/")
    public String root(){
        return "redirect:article/lsit";
    }
}
