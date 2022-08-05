package com.bot.backend.controller.user.account;

import com.bot.backend.pojo.Bot;
import com.bot.backend.service.user.bot.GetListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : liqinzuo
 * @date : 2022/8/2
 * Description :
 */
@RestController
public class GetListController {

    @Autowired
    private GetListService getListService;

    @GetMapping("/user/bot/getlist/")
    public List<Bot> getList(){
        return getListService.getList();
    }

}
