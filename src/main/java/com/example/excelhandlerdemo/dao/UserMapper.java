package com.example.excelhandlerdemo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.excelhandlerdemo.entity.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {

    List<User> selectAll();

}
