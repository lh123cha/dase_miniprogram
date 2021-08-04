package com.example.demo.login.service;

import com.example.demo.login.entity.Users;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author SuYaKang
 * @since 2021-08-03
 */
public interface UsersSerice extends IService<Users> {
    List<Users> getUsers();

}
