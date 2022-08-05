package com.bot.backend.service.user.account;

import java.util.Map;

/**
 * @author : liqinzuo
 * @date : 2022/7/27
 * Description :
 */
public interface RegisterService {
    public Map<String, String> register(String username, String password, String confirmedPassword);
}
