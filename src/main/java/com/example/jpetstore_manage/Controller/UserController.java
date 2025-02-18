package com.example.jpetstore_manage.Controller;

import com.example.jpetstore_manage.POJO.MapStruct.UserMapping;
import com.example.jpetstore_manage.POJO.ViewObject.Message;
import com.example.jpetstore_manage.POJO.ViewObject.UserVO;
import com.example.jpetstore_manage.Service.UserService;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Raymond Li
 * @create 2023-03-20 16:31
 * @description 用户数据接口，前端通过AJAX请求数据，页面跳转请调用AllPageController中的接口
 * 注册
 * 登录
 * 退出登录
 * 修改密码
 * 修改个人信息（数据库待设计）
 * 扫码登录（拓展功能）
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    /**
     * 业务层接口
     */
    @Autowired
    private UserService userService;

    /**
     * 对象转换器
     */
    @Autowired
    private UserMapping userMapping;


    /**
     * 检查验证码
     * 判断两次输入的密码是否相同
     * 对象转换,调用service
     * 将转换后的UserMainDO配置到session
     *
     * @return 返回一个Message对象
     */
    @PostMapping("/register")
    public Message register(@RequestBody UserVO userVO, @SessionAttribute("checkCode") String checkCode, HttpSession session) {
        return null;
    }

    /**
     * 检查验证码
     * 对象转换,调用service
     * 将转换后的UserMainDO配置到session
     *
     * @return 返回一个Message对象
     */
    @PostMapping("/login")
    public Message login(@RequestBody UserVO userVO, @SessionAttribute("checkCode") String checkCode, HttpSession session) {
        return null;
    }


    /**
     * 将“loginUser”从session中移除
     *
     * @return 返回一个Message对象
     */
    @DeleteMapping("/signOut")
    public Message signOut(HttpSession session) {
        return null;
    }

    /**
     * 检查验证码
     * 判断两次输入的密码是否相同
     * 对象转换,调用service
     *
     * @return 返回一个Message对象
     */
    @PutMapping("/changePassword")
    public Message changePassword(@RequestBody UserVO userVO, @SessionAttribute("checkCode") String checkCode) {
        return null;
    }
}