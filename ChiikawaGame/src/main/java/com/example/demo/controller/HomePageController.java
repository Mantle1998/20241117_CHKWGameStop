package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
	
	// 顯示商城首頁頁面 (http://localhost:8080/homePage)
    @GetMapping("/homePage")
    public String showhomePage() {
        return "homePage";
    }

}
