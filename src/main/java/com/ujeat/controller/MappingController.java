package com.ujeat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 映射Template下的html控制器
 * Created by MetalSteel on 2017/11/2.
 */
@Controller
public class MappingController {
    /**
     * 测试页面
     */
    @GetMapping("/hello")
    public String hello(){
        return "/hello";
    }
    /**
     * 默认页面
     */
    @GetMapping("/")
    public String defaultPage(){
        return "/index";
    }
    /**
     * 访问首页
     * @return
     */
    @GetMapping("/index")
    public String index(){
        return "/index";
    }
    /**
     * 访问最新资讯
     * @return
     */
    @GetMapping("/news")
    public String news(){
        return "/news";
    }
    /**
     * 访问联系我们
     * @return
     */
    @GetMapping("/contact")
    public String contact(){
        return "/contact";
    }
    /**
     * 访问关于我们
     * @return
     */
    @GetMapping("/about")
    public String about(){
        return "/about";
    }
}
