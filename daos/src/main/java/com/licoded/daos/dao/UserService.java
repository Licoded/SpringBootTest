package com.licoded.daos.dao;

import com.licoded.daos.table.User;
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
