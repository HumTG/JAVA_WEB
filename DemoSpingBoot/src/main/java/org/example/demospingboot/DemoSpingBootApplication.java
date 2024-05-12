package org.example.demospingboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpingBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpingBootApplication.class, args);
        System.out.printf("running .... OK123");
    }

}
