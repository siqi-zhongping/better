package com.discipline.better.serviceImpl;

import com.discipline.better.entity.Food;
import com.discipline.better.mapper.FoodMapper;
import com.discipline.better.service.FoodService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zzp
 * @since 2022-09-12 11:03:35
 */
@Service
public class FoodServiceImpl extends ServiceImpl<FoodMapper, Food> implements FoodService {

}
