package com.gloryh.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.gloryh.mybatisplus.enums.AgeEnum;
import com.gloryh.mybatisplus.enums.StatusEnum;
import lombok.Data;

import java.util.Date;

/**
 * User 实体类
 *
 * @author 黄光辉
 * @since 2020/10/5
 **/
@Data
@TableName("user")
public class User {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String username;
    private String password;
    private AgeEnum age;
    @TableField(fill = FieldFill.INSERT)
    private Date creatTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
    @Version
    private Integer version;
    private StatusEnum status;
    @TableLogic
    private Integer deleted;
}
