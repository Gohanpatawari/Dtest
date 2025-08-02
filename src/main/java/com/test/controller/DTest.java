package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fayaz")
public class DTest {

	@GetMapping
	public String test1() {
		return "Hi gohan";
	}
	
}
