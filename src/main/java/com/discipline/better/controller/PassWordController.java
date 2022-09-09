package com.discipline.better.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.discipline.better.service.PasswordService;
import com.discipline.res.res.Res;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zzp
 * @since 2022-09-09 04:53:12
 */
@RestController
@RequestMapping("/password")
public class PasswordController {
	@Autowired
	private PasswordService passwordService;
	@GetMapping("/list")
	public Res list() {
		System.out.println("=================================");
		return Res.success(passwordService.list());
	}
}
