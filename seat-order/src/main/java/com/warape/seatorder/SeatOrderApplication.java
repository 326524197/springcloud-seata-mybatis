package com.warape.seatorder;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.warape.seatorder.mapper")
@EnableFeignClients
public class SeatOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeatOrderApplication.class,args);
    }
}
