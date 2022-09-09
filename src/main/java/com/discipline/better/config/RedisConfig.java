package com.discipline.better.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
@Configuration
public class RedisConfig {
	@Bean
	public RedisTemplate<String, Object> objectRedis(RedisConnectionFactory factory) {
		GenericJackson2JsonRedisSerializer serializer = new GenericJackson2JsonRedisSerializer();
		StringRedisSerializer stringRedis = new StringRedisSerializer();
		RedisTemplate<String, Object> template = new RedisTemplate<>();
		template.setConnectionFactory(factory);
		template.setKeySerializer(stringRedis);
		template.setHashKeySerializer(stringRedis);
		template.setValueSerializer(serializer);
		template.setHashValueSerializer(serializer);
		template.afterPropertiesSet();
		return template;
	}
}
