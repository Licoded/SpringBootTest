package com.licoded.daos.mapper.my;

import com.licoded.daos.table.User;

import java.util.List;


public interface MyUserMapper {
    List<User> findAll();
}
