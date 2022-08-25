package com.discipline.better.service;

import java.util.List;

import com.discipline.better.entity.Food;

public interface FoodService {
	public void add(Food food);
	public List<Food> list();
}
