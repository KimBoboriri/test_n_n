package com.springvue.prectice.service;

import com.springvue.prectice.dao.UserMapper;
import com.springvue.prectice.vo.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl  {

    @Autowired
    private UserMapper usermapper;

    public List<UserDto> selectList(){
        System.out.println("서비스단");
        return usermapper.selectList();
    }
}
