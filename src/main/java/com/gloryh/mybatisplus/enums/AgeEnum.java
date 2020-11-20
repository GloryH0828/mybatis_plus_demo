package com.gloryh.mybatisplus.enums;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * 年龄枚举类
 *
 * @author 黄光辉
 * @since 2020/10/8
 **/
public enum AgeEnum implements IEnum<Integer> {
    twentyOne(21, "二十一"),
    twentyTwo(22, "二十二"),
    twentyThree(23, "二十三"),
    twentyFour(24, "二十四"),
    twentyNine(29, "二十九");

    private final Integer code;
    private final String msg;

    AgeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public Integer getValue() {
        return this.code;
    }
}
