package com.bot.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bot.backend.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author : liqinzuo
 * @date : 2022/7/22
 * Description :
 */

@Mapper
public interface UserMapper extends BaseMapper<User> {


}
