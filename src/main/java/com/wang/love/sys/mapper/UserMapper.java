package com.wang.love.sys.mapper;

import com.wang.love.sys.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 后台用户表（后台管理使用） Mapper 接口
 * </p>
 *
 * @author wang
 * @since 2020-11-04
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
