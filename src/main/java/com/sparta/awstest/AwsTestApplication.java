package com.sparta.awstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AwsTestApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(AwsTestApplication.class, args);
        String dbUrl = ctx.getEnvironment().getProperty("spring.datasource.url");
        System.out.println("dbUrl = " + dbUrl);
    }

}
