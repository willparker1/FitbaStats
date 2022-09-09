package com.porkerspicks.fitbastats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FitbaStatsApplication {

    public static void main(String[] args) {
        SpringApplication.run(FitbaStatsApplication.class, args);
    }

}
