package com.bot.backend.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author : liqinzuo
 * @date : 2022/8/2
 * Description :
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bot {
    @TableId(type= IdType.AUTO)
    private Integer id;
    private Integer userId;
    private String description;
    private String content;
    private String title;
    private Integer rating;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Shanghai")
    private Date createtime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Shanghai")
    private Date modifytime;



}
