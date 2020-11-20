package com.gloryh.mybatisplus.generator.service.Impl;

import com.gloryh.mybatisplus.generator.entity.User;
import com.gloryh.mybatisplus.generator.mapper.UserMapper;
import com.gloryh.mybatisplus.generator.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 黄光辉
 * @since 2020-10-11
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
