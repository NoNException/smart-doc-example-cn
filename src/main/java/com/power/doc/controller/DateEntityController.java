package com.power.doc.controller;

import com.power.doc.entity.DateEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试JDK8的时间兼容
 * @author yu 2018/12/11.
 */
@RestController
public class DateEntityController {

    /**
     * 测试LocalDate
     * @param dateEntity
     * @return
     */
    @PostMapping("dateEntity")
    public DateEntity testDate(@RequestBody DateEntity dateEntity){

        return null;
    }
}
