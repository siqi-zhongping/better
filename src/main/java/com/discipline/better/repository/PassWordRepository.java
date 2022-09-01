package com.discipline.better.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.discipline.better.entity.PassWord;

public interface PassWordRepository extends JpaRepository<PassWord,Integer>,Serializable {

}
