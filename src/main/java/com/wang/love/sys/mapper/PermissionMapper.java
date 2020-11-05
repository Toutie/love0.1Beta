package com.wang.love.sys.mapper;

import com.wang.love.sys.entity.Permission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 系统权限表 Mapper 接口
 * </p>
 *
 * @author wang
 * @since 2020-11-04
 */
@Mapper
public interface PermissionMapper extends BaseMapper<Permission> {

}
