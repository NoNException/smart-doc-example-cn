package com.power.doc.controller;

import com.alibaba.fastjson.JSON;
import com.power.doc.entity.Car;
import com.power.doc.entity.SimpleUser;
import com.power.doc.enums.SimpleEnum;
import org.beetl.ext.fn.Json;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * 接收表单参数
 * @author yu 2019/10/29.
 */
@RestController
public class FormDataController {

    private Logger log = LoggerFactory.getLogger(FormDataController.class);
    /**
     * 测试formData
     * @param car
     */
    @PostMapping("formData1")
    public void formData1(Car car){
       log.info(JSON.toJSONString(car));
    }

    /**
     * Post请求发表单文件
     * @param userId
     * @param userData
     */
    @PostMapping("formData2")
    public void formData2(String userId, String userData, MultipartFile file){
        System.out.println("success");
    }

    /**
     * Get请求发表单文件 暂不支持完全解析
     * @param userId
     * @param userData
     * @param file
     */
    @GetMapping("formData2")
    public void formData3(String userId, String userData, MultipartFile file){
        System.out.println("success");
    }

    /**
     * 表单 包含复杂对象的Get 暂不支持完全解析
     * @param userId
     * @param userData
     * @param simpleUser
     */
    @GetMapping("formData4")
    public void formData4(String userId, String userData, SimpleUser simpleUser){
        log.info("userId: {} userData: {},SimpleUser: {}",userId,userData,JSON.toJSONString(simpleUser));
    }
//    /**
//     * 表单 包含复杂对象
//     * @param userId
//     * @param userData
//     * @param simpleUser
//     */
//    @PostMapping(path = "formData5")
//    public void formData5(String userId, String userData,SimpleUser simpleUser){
//        log.info("userId: {} userData: {},SimpleUser: {}",userId,userData,JSON.toJSONString(simpleUser));
//    }

//    /**
//     * 表单 枚举
//     * @param userId
//     * @param userData
//     * @param simpleUser
//     */
//    @GetMapping("formData6")
//    public void formData6(String userId, String userData, SimpleEnum simpleUser){
//        log.info(JSON.toJSONString(simpleUser));
//    }

    /**
     * 测试formData带路径参数
     * @param id
     * @param simpleUser
     */
    @PostMapping("formData7/{id}")
    public void formData7(@PathVariable String id, SimpleUser simpleUser){
        log.info(JSON.toJSONString(simpleUser));
    }

    /**
     * 测试formData带路多个路径参数
     * @param id
     * @param age
     * @param simpleUser
     */
    @PostMapping("formData8/{id}/{age}")
    public void formData8(@PathVariable String id,@PathVariable Integer age, SimpleUser simpleUser){
        log.info(JSON.toJSONString(simpleUser));
    }


}
