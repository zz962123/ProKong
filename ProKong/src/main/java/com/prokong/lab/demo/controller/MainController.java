package com.prokong.lab.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/main")
	public String vamp() {
		return "main/webMain";
	}
}
