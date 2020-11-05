package com.wang.love.sys.service.impl;

import com.wang.love.sys.entity.Role;
import com.wang.love.sys.mapper.RoleMapper;
import com.wang.love.sys.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统角色表 服务实现类
 * </p>
 *
 * @author wang
 * @since 2020-11-04
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
