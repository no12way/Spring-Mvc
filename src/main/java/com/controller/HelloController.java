package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello";
    }
    // @RequestMapping注解：处理请求和控制器方法之间的映射关系
    //服务器中 / 代表的是绝对路径，分为浏览器解析和服务器解析
    //请求路径为上下文路径http://localhost:8080/SpringMVC/，此方法就为处理请求的方法
// @RequestMapping注解的value属性可以通过请求地址匹配请求，/表示的当前工程的上下文路径
// localhost:8080/springMVC/
    @RequestMapping("/")
    public String index() {
        //设置视图名称
        //将逻辑视图返回，然后被配置文件中视图解析器解析，给逻辑视图加上前缀后缀，
        // 匹配完整的物理视图，通过Thymeleaf渲染跳转到页面
        return "index";
    }


}
