package com.example.demo.pie.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.pie.entity.Pie;
import com.example.demo.pie.mapper.PieMapper;
import com.example.demo.pie.service.IPieService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author SuYaKang
 * @since 2021-06-30
 */
@Service
public class PieServiceImpl extends ServiceImpl<PieMapper, Pie> implements IPieService {

    @Autowired
    PieMapper pieMapper;
    @Override
    public List<Pie> getCityData() {
        return pieMapper.selectList(new QueryWrapper<Pie>());
    }
}
