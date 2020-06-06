package com.springvue.prectice.dao;

import com.springvue.prectice.vo.UserDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select(" SELECT * FROM USER ")
    List<UserDto> selectList();
}
