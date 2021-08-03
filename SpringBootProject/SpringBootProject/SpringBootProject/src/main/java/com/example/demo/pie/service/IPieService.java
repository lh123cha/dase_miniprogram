package com.example.demo.pie.service;

import com.example.demo.pie.entity.Pie;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author SuYaKang
 * @since 2021-06-30
 */
public interface IPieService extends IService<Pie> {
    List<Pie> getCityData();
}
