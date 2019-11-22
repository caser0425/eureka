package com.cloud.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


@RestController
@RequestMapping(value = "home",method = RequestMethod.GET)
public class helloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello springboot";
    }

    @RequestMapping("/now")
    public String getTime(){
        return "Current time: " + (new Date()).toString();
    }

    @RequestMapping("/index")
    public String index(ModelMap map){
        map.addAttribute("host", "http://blog.didispace.com");
        return "index";
    }

}


@RestController
@RequestMapping(value = "/teacher")
@Api(tags = {"教师管理","教学管理"})
class TeacherController {

    @GetMapping("/xxx")
    public String xxx() {
        return "xxx";
    }

}

@RestController
@RequestMapping(value = "/student")
@Api(tags = {"学生管理", "教学管理"})
class StudentController {

    @ApiOperation("获取学生清单")
    @GetMapping("/list")
    public String bbb() {
        return "bbb";
    }

    @ApiOperation("获取教某个学生的老师清单")
    @GetMapping("/his-teachers")
    public String ccc() {
        return "ccc";
    }

    @ApiOperation("创建一个学生")
    @PostMapping("/aaa")
    public String aaa() {
        return "aaa";
    }

}