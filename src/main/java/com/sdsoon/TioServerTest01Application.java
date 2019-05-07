package com.sdsoon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.io.IOException;

@SpringBootApplication
public class TioServerTest01Application extends SpringBootServletInitializer {

    public static void main(String[] args) throws IOException {

        //ServerStarter.start();


        SpringApplication.run(TioServerTest01Application.class, args);

    }

    @Override//为了打包springboot项目
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(this.getClass());
    }
}
