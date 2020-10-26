package com.licoded.test01.service;

import com.licoded.test01.domain.User;
import com.licoded.test01.mapper.my.MyUserMapper;
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
