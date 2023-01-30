package com.in28minutes.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentServicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentServicesApplication.class, args);
    }

    public static double divideNumbers(double dividend, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero!");
        }
        return dividend / divisor;
    }

}
