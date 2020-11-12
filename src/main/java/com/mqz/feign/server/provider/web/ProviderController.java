package com.mqz.feign.server.provider.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mqz
 * @description
 * @abount https://github.com/DemoMeng
 * @since 2020/11/11
 */
@RestController
@RequestMapping(value = "/feign/service/provider")
public class ProviderController {


    @GetMapping(value = "/1")
    public String handle(String userName){
        //TODO 模拟具体业务层调用
        return "【服务提供方 1 ：】"+userName+":server调用成功";
    }

    @PostMapping(value = "/2")
    public String deal1(String json){
        return "【服务提供方 1 ：】传递的JSON为："+json;
    }


}
