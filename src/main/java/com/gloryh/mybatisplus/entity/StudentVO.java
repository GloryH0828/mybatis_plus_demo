package com.gloryh.mybatisplus.entity;

import lombok.Data;

/**
 * 学生信息表对应VO
 *
 * @author 黄光辉
 * @since 2020/10/8
 **/
@Data
public class StudentVO {
    private Integer id;
    private String name;
    private Integer cId;
    private String className;
}
