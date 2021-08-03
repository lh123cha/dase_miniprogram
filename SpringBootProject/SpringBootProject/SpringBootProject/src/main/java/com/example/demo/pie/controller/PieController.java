package com.example.demo.pie.controller;


import com.alibaba.fastjson.JSON;
import com.example.demo.pie.entity.Pie;
import com.example.demo.pie.service.IPieService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import springfox.documentation.annotations.ApiIgnore;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author SuYaKang
 * @since 2021-06-30
 */
@Controller
@RequestMapping("/pie")
@Api(value = "饼图",tags={"饼图"})
public class PieController {
    @Autowired
    IPieService pieService;

    @RequestMapping(value = "/getCityData",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "获取城市信息",notes = "获取城市信息")
    @ApiResponses({
            @ApiResponse(code = 200,message = "成功"),
            @ApiResponse(code = 500,message = "失败")

    })
    String getCityData(){
        Map<String,Object>res=new HashMap<String,Object>();
        try{
            List<Pie> pieList=pieService.getCityData();
            res.put("status",200);
            res.put("data",pieList);
        }catch (Exception ex){
            res.put("status",500);
            res.put("errorMsg",ex.getMessage());
        }
        return JSON.toJSONString(res);
    }

    @RequestMapping(value = "/show",method = RequestMethod.GET)
    @ApiIgnore
    String show(){
        return "pie";
    }
}
