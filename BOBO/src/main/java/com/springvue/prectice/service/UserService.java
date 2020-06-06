package com.springvue.prectice.service;

import com.springvue.prectice.vo.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<UserDto> selectList();
}
