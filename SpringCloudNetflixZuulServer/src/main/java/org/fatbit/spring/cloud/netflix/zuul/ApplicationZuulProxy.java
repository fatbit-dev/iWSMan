package org.fatbit.spring.cloud.netflix.zuul;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
@EnableZuulProxy
public class ApplicationZuulProxy {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ApplicationZuulProxy.class).web(true).run(args);
    }

}
