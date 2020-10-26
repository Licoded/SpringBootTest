package com.licoded.main.service;

import com.licoded.main.domain.User;
import com.licoded.main.mapper.my.MyUserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    MyUserMapper myUserMapper;
    public List<User> findAll(){
        return myUserMapper.findAll();
    }
}
