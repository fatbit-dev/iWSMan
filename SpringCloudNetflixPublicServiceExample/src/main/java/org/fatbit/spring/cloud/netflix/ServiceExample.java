package org.fatbit.spring.cloud.netflix;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@RestController
//@SpringBootApplication
public class ServiceExample {

    @Value($"{rest.service.cloud.config.example}")
    String valueExample = null;

    private static Logger log = LoggerFactory.getLogger(ServiceExample.class);

    @RequestMapping(value = "/example")
    public String example() {

        String result = "{Empty Value}";

        if(valueExample.equals(null)) {

            log.error("PublicRestService - Called with errors property rest.service.cloud.config.example is empty");

        }
        else {
            log.info("PublicRestService - Called with this property: (rest.service.cloud.config.example:"+valueExample+")");
            result = valueExample;
        }

        return result;
    }

    //public static void main(String[] args) {
    //    SpringApplication.run(ServiceExample.class, args);
    //}
}