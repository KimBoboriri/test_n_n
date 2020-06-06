package com.springvue.prectice.service;

import com.springvue.prectice.dao.UserMapper;
import com.springvue.prectice.vo.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper usermapper;

    public List<UserDto> selectList(){
        return usermapper.selectList();
    }
}
