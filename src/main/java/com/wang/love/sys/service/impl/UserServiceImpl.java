package com.wang.love.sys.service.impl;

import com.wang.love.sys.entity.User;
import com.wang.love.sys.mapper.UserMapper;
import com.wang.love.sys.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* <p>
 * 后台用户表（后台管理使用） 服务实现类
 * </p>
*
* @author wang
* @since 2020-11-04
*/
@Service
 public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

 }
