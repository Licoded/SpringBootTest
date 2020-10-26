package com.licoded.daos.service;

import com.licoded.daos.domain.User;
import com.licoded.daos.mapper.my.MyUserMapper;
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
