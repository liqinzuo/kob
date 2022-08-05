package com.bot.backend.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author : liqinzuo
 * @date : 2022/7/22
 * Description :
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @TableId(type= IdType.AUTO)
    private Integer id;
    private String username;
    private String password;
    private String photo;


}
