package com.example.demo.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.UserInfo;

@Mapper
public interface UserInfoMapper {
    List<UserInfo> selectAll();
}

