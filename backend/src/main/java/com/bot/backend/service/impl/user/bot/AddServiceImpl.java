package com.bot.backend.service.impl.user.bot;

import com.bot.backend.mapper.BotMapper;
import com.bot.backend.pojo.Bot;
import com.bot.backend.pojo.User;
import com.bot.backend.service.impl.utils.UserDetailsImpl;
import com.bot.backend.service.user.bot.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : liqinzuo
 * @date : 2022/8/2
 * Description :
 */
@Service
public class AddServiceImpl implements AddService {

    @Autowired
    private BotMapper botMapper;

    @Override
    public Map<String, String> add(Map<String, String> data) {
        UsernamePasswordAuthenticationToken authenticationToken = (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        UserDetailsImpl loginUser = (UserDetailsImpl) authenticationToken.getPrincipal();
        User user = loginUser.getUser();

        String title = data.get("title");
        String description = data.get("description");
        String content = data.get("content");

        Map<String,  String> map = new HashMap<>();

        if(title == null || title.length() == 0){
            map.put("error_message","标题不能为空~");
            return map;
        }
        if(title.length() > 200){
            map.put("error_message","标题长度不能大于200~");
            return map;
        }
        if(description == null || description.length() == 0){
            map.put("error_message","这个用户很懒，什么也没留下哦～");
        }

        if(description != null && description.length() > 1000){
            map.put("error_message","Bot描述的长度不能大于1000~");
            return map;
        }
        if(content == null || content.length() == 0){
            map.put("error_message","代码不能为空~");
            return map;
        }
        if(content.length() > 15000){
            map.put("error_message","代码长度不能超过15000~");
            return map;
        }


        Date now = new Date();
        Bot bot = new Bot(null, user.getId(), description, content, title, 1500, now, now);

        botMapper.insert(bot);
        map.put("error_message","success");

        return map;
    }
}
