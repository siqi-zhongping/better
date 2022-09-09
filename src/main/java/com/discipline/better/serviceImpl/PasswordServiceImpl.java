package com.discipline.better.serviceImpl;

import com.discipline.better.entity.Password;
import com.discipline.better.mapper.PasswordMapper;
import com.discipline.better.service.PasswordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zzp
 * @since 2022-09-09 04:53:12
 */
@Service
public class PasswordServiceImpl extends ServiceImpl<PasswordMapper, Password> implements PasswordService {

}
