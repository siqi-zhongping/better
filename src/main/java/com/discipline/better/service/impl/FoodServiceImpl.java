package com.discipline.better.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.discipline.better.entity.Food;
import com.discipline.better.repository.FoodRepository;
import com.discipline.better.service.FoodService;

@Service
public class FoodServiceImpl implements FoodService{
	@Autowired
	private FoodRepository foodRepository;
	@Override
	public void add(Food food) {
		foodRepository.save(food);
	}
}
