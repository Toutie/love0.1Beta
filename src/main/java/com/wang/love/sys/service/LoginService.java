package com.wang.love.sys.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wang.love.sys.entity.User;
import com.wang.love.sys.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wang
 */
@Service
public class LoginService  {
    @Autowired
    UserServiceImpl userService;

    /**后台管理登录接口
     * @param user 系统用户对象
     * @return 登录结果{true:登录成功，false：登录失败}
     */
    public boolean sysLogin(String username, String password){
        if (username!=null&& !"".equals(username)){
            User user = userService.getOne(
                    new QueryWrapper<User>().eq("sys_username", username)
            );
            //用户不为空的时候 再核对密码
            if (user!=null){
                return password.equals(user.getSysPassword());
            }
        }
        return false;
    }

}