package com.example.sampleapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SampleApiApplication {

    @RequestMapping("/")
    String printForSlash()
    {
        return "Hello world from main page";
    }

    @RequestMapping("/GetEmployeeDetails")
    String printForEmployeeDetails()
    {
        String details;
        details = "Name : Sanjeev Sharma" + "\n" + "EmployeeID: 123";
        return details;
    }


    public static void main(String[] args) {
        SpringApplication.run(SampleApiApplication.class, args);
    }

}
