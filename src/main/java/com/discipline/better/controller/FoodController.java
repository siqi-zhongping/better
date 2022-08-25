package com.discipline.better.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.discipline.better.entity.Food;
import com.discipline.better.service.FoodService;
import com.discipline.res.res.Res;

@RestController
@RequestMapping("/api/food/")
public class FoodController {
	@Autowired
	private FoodService foodService;
	@GetMapping("add")
	public Res add() {
		return Res.success();
	}
	@GetMapping("list")
	public Res list() {
		List<Food> list = foodService.list();
		return Res.success(list,"获取食物列表成功");
	}
}
