package com.example.demo.a;

import org.springframework.stereotype.Controller;

@Controller
public class AController {
	
	public String start() {
		System.out.println("아주 어려운 로직");
		return "a/index";
	}
}
