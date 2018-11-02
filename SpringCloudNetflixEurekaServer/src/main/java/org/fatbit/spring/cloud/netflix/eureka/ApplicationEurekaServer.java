package org.fatbit.spring.cloud.netflix.eureka;//package org.fatbit.spring.cloud.netflix.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ApplicationEurekaServer {

    public static void main(String[] args) {//throws Exception {
        SpringApplication.run(ApplicationEurekaServer.class, args);
    }

}