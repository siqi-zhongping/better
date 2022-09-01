package com.discipline.better.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.discipline.better.entity.PassWord;
import com.discipline.better.repository.PassWordRepository;
import com.discipline.better.service.PassWordServiece;
@Service
public class PassWordServieceImpl implements PassWordServiece{
	@Autowired
	private PassWordRepository passWordRepository;

	@Override
	public void add(PassWord password) {
		passWordRepository.save(password);
	}
	
	@Override
	public List<PassWord> list() {
		List<PassWord> passwordList =  passWordRepository.findAll();
		return passwordList;
	}
}
