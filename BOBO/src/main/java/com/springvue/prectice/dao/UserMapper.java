package com.springvue.prectice.dao;

import com.springvue.prectice.vo.UserDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {
    List<UserDto>selectList();
}
