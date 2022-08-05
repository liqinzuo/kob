package com.bot.backend.service.impl.user.bot;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bot.backend.mapper.BotMapper;
import com.bot.backend.pojo.Bot;
import com.bot.backend.pojo.User;
import com.bot.backend.service.impl.utils.UserDetailsImpl;
import com.bot.backend.service.user.bot.GetListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : liqinzuo
 * @date : 2022/8/2
 * Description :
 */
@Service
public class GetListServiceImpl implements GetListService {

    @Autowired
    private BotMapper botMapper;


    @Override
    public List<Bot> getList() {
        UsernamePasswordAuthenticationToken authenticationToken = (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        UserDetailsImpl loginUser = (UserDetailsImpl) authenticationToken.getPrincipal();
        User user = loginUser.getUser();


        QueryWrapper<Bot> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_id",user.getId());

        return botMapper.selectList(queryWrapper);
    }
}
