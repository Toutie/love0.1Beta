package com.wang.love.sys.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 客户资料实体类
 * @author wang
 */
@Data
@TableName("love_user_detail")
public class LoveUserDetail {

    /**
     * 编码
     */
    private String uid;

    /**
     * 名字
     */
    private String loveName;

    /**
     * 身份证号
     */
    private String idCard;

    /**
     * 性别
     */
    private Character loveGender;

    /**
     * 年龄
     */
    private Integer loveAge;

    /**
     * 出生年月
     */
    private String loveBirth;

    /**
     * 手机号
     */
    private String lovePhone;

    /**
     * 邮箱
     */
    private String loveEmail;

    /**
     * 微信号
     */
    private String loveWeChat;

    /**
     * QQ号
     */
    private String loveQq;

    /**
     * 学历
     */
    private String loveEducation;

    /**
     * 爱好
     */
    private String loveHobby;

    /**
     * 毕业学校
     */
    private String school;

    /**
     * 自我介绍
     */
    private String introduction;


}
