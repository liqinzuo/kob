package com.bot.backend.service.user.account;

import java.util.Map;

/**
 * @author : liqinzuo
 * @date : 2022/7/27
 * Description :
 */
public interface LoginService {

    public Map<String, String> getToken(String username, String password);
}
