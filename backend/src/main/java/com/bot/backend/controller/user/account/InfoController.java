package com.bot.backend.controller.user.account;

import com.bot.backend.service.user.account.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author : liqinzuo
 * @date : 2022/7/30
 * Description :
 */
@RestController
public class InfoController {
    @Autowired
    private InfoService infoService;

    @GetMapping("/user/account/info/")
    public Map<String,String> getinfo(){
        return infoService.getInfo();
    }

}
