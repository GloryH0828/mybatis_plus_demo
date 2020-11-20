package com.gloryh.mybatisplus.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;

/**
 * 用户实体类 status成员变量 枚举类型
 *
 * @author 黄光辉
 * @since 2020/10/8
 **/
public enum  StatusEnum {
    WORK(1,"上班状态"),
    REST(0,"休息状态");

    StatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @EnumValue
    private final Integer code;
    private final String msg;

}
