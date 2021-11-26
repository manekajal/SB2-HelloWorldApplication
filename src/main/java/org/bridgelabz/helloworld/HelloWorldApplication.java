package org.bridgelabz.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {

    public static void main(String[] args) {

        System.out.println("Hello Kajal");
        SpringApplication.run(HelloWorldApplication.class, args);
    }

}
