package com.mqz.feign.server.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author mqz
 *
 *  feign的服务提供方，不需要开启任何feign配置
 *  只需要把该服务注册到eureka注册中心即可
 */
@SpringBootApplication
@EnableEurekaClient
public class FeginServerProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeginServerProviderApplication.class, args);
    }

}
