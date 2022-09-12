package com.discipline.better.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.discipline.better.entity.Password;
import com.discipline.better.res.R;
import com.discipline.better.service.PasswordService;

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
	public R list() {
		System.out.println("=================================");
		String regionalismJsonStr = JSON.toJSONString(passwordService.list());
        // 存储数据到缓存
        redisTemplate.opsForValue().set("a", regionalismJsonStr);
		return R.ok(passwordService.list());
	}
	@GetMapping("/list/redis")
	public R listRedis() {
		System.out.println("=================================");
        // 存储数据到缓存
        String regionalismJsonStr = redisTemplate.opsForValue().get("a");
		return R.ok(JSONObject.parseArray(regionalismJsonStr, Password.class));
	}
}
