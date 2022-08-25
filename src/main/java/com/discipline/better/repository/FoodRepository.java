package com.discipline.better.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.discipline.better.entity.Food;

public interface FoodRepository extends JpaRepository<Food,Integer>,Serializable  {

}
