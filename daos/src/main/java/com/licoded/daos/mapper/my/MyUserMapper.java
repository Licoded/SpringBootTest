package com.licoded.daos.mapper.my;

import com.licoded.daos.domain.User;

import java.util.List;


public interface MyUserMapper {
    List<User> findAll();
}
