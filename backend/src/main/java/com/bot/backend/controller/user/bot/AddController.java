package com.bot.backend.controller.user.bot;

import com.bot.backend.service.user.bot.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author : liqinzuo
 * @date : 2022/8/2
 * Description :
 */
@RestController
public class AddController {
    @Autowired
    private AddService addService;

    @PostMapping("/user/bot/add/")
    public Map<String,String> add(@RequestParam Map<String,String> data){

        return addService.add(data);
    }


}
