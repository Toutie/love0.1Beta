package com.wang.love.sys.service.impl;

import com.wang.love.sys.entity.Permission;
import com.wang.love.sys.mapper.PermissionMapper;
import com.wang.love.sys.service.IPermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统权限表 服务实现类
 * </p>
 *
 * @author wang
 * @since 2020-11-04
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements IPermissionService {

}
