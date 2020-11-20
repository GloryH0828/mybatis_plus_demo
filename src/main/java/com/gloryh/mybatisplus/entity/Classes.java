package com.gloryh.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 班级实体类
 *
 * @author 黄光辉
 * @since 2020/10/8
 **/
@Data
@TableName("classes")
public class Classes {
    @TableId
    private Integer id;
    private String name;
}
