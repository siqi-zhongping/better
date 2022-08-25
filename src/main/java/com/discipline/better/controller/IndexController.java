package com.discipline.better.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.discipline.res.res.Res;

@RestController
@RequestMapping("/api/")
public class IndexController {
	@GetMapping("index")
	public Res add() {
		return Res.success();
	}
}
