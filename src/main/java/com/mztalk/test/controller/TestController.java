package com.mztalk.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mentor")
public class TestController {

	@GetMapping("/test")
	public String test() {
		return "테스트 성공!";
	}
}
