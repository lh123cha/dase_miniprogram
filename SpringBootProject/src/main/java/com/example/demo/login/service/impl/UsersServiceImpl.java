package com.example.demo.login.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.login.entity.Users;
import com.example.demo.login.mapper.UsersMapper;
import com.example.demo.login.service.UsersSerice;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.pie.entity.Pie;
import com.example.demo.pie.mapper.PieMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author SuYaKang
 * @since 2021-08-03
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersSerice {


    @Autowired
    UsersMapper usersMapper;

    @Override
    public List<Users> getUsers() {
        return usersMapper.selectList(new QueryWrapper<Users>());
    }
}
