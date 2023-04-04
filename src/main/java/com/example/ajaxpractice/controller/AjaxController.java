package com.example.ajaxpractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {
    @GetMapping("/ex01")
    public String ex01() {
        System.out.println("나는 01 입니다.");
        return "index"; // index.html 에 작성된 코드가 출력됨
    }

    @PostMapping("/ex02")
    public @ResponseBody String ex02() {
        System.out.println("나는 02 입니다.");
        return "index"; // 리턴값이 그대로 출력됨 (리턴 하는 값을 Body 에 실어서 같이 보내준다.)
    }
}
