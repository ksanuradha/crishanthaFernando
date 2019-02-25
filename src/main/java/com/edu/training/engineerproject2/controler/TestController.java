package com.edu.training.engineerproject2.controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {
	@RequestMapping("/")
	public String firstPage() {
		return "K S Anuradha";
	}

}
