package com.bot.backend.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : liqinzuo
 * @date : 2022/7/8
 * Description :
 */
@RestController
@RequestMapping("/pk/")
public class BotInfoController {

    @RequestMapping("getbotinfo/")
    public Map<String,String>  getBotInfo(){
        Map<String, String> bot1 = new HashMap<>();
        bot1.put("name", "apple");
        bot1.put("rating", "1800");

        return bot1;
    }
}
