package com.discipline.better.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.discipline.better.entity.Password;
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
    private StringRedisTemplate redisTemplate;
	
	@Autowired
	private PasswordService passwordService;
	
	@GetMapping("/list")
	public Res list() {
		System.out.println("=================================");
		String regionalismJsonStr = JSON.toJSONString(passwordService.list());
        // 存储数据到缓存
        redisTemplate.opsForValue().set("a", regionalismJsonStr);
		return Res.success(passwordService.list());
	}
	@GetMapping("/list/redis")
	public Res listRedis() {
		System.out.println("=================================");
        // 存储数据到缓存
        String regionalismJsonStr = redisTemplate.opsForValue().get("a");
		return Res.success(JSONObject.parseArray(regionalismJsonStr, Password.class));
	}
}
