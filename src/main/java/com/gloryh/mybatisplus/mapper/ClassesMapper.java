package com.gloryh.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gloryh.mybatisplus.entity.Classes;
import com.gloryh.mybatisplus.entity.StudentVO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Classes 实体类 Mapper 接口
 *
 * @author 黄光辉
 * @since 2020/10/8
 **/
public interface ClassesMapper extends BaseMapper<Classes> {
    @Select("SELECT s.*,c.name as class_name FROM student s,classes c WHERE s.c_id = c.id AND c.id = #{id}")
    List<StudentVO> students(Integer id);
}
