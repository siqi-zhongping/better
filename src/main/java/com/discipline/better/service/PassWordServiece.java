package com.discipline.better.service;

import java.util.List;

import com.discipline.better.entity.PassWord;

public interface PassWordServiece {
	public void add(PassWord password);
	public List<PassWord> list();
}
