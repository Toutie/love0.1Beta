package com.wang.love.sys.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 后台用户表（后台管理使用）
 * </p>
 *
 * @author wang
 * @since 2020-11-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sys_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("sys_uid")
    private String sysUid;

    /**
     * 后台用户名
     */
    @TableField("sys_username")
    private String sysUsername;

    /**
     * 后台密码
     */
    @TableField("sys_password")
    private String sysPassword;

    /**
     * 盐值
     */
    @TableField("sys_salt")
    private String sysSalt;

    /**
     * 用户详细资料UID
     */
    @TableField("love_detail_uid")
    private String loveDetailUid;


}
