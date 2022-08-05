package com.bot.backend.service.impl.user.account;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bot.backend.mapper.UserMapper;
import com.bot.backend.pojo.User;
import com.bot.backend.service.user.account.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : liqinzuo
 * @date : 2022/7/30
 * Description :用户注册
 */
@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Map<String, String> register(String username, String password, String confirmedPassword) {
        Map<String, String> map = new HashMap<>();
        if(username == null){
            map.put("error_message","用户名不能为空");
            return map;
        }
        if(password == null || confirmedPassword == null){
            map.put("error_message","密码不能为空");
            return map;
        }

        username = username.trim();//删掉空格和回车

        if(username.length() == 0){
            map.put("error_message","用户名不能为空");
            return map;
        }
        if(username.length() > 100){
            map.put("error_message", "用户名的长度不能大于100哦～");
            return map;
        }
        if(password.length() == 0 || confirmedPassword.length() == 0){
            map.put("error_message","密码不能为空");
            return map;
        }
        if(password.length() > 100 || confirmedPassword.length() > 100){
            map.put("error_message", "密码的长度不能大于100哦～");
            return map;
        }
        if(!password.equals(confirmedPassword)){
            map.put("error_message","前后两次密码不一致");
            return map;
        }

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username",username);
        List<User> users = userMapper.selectList(queryWrapper);
        if(!users.isEmpty()){
            map.put("error_message","用户已存在");
            return map;
        }

        String encodedPassword = passwordEncoder.encode(password);
        String photo = "https://cdn.acwing.com/media/user/profile/photo/90865_lg_10b437b8a1.jpg";
        User user = new User(null, username, encodedPassword, photo);
        userMapper.insert(user);

        map.put("error_message", "success");
        return map;
    }
}
