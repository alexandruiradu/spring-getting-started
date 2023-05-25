package ro.sda.spring.services;

import org.springframework.stereotype.Service;
@Service
public class MathService {

    public MathService() {
        System.out.println("MathService constructor called!");
    }

    public int add(int a, int b) {
        if ((a + b) % 2 == 0) {
            throw new RuntimeException();
        }
        return a + b;
    }

    public int subtract(int a, int b){
        if((a - b) % 2 == 0){
            throw new RuntimeException();
        }
        return a - b;
    }

    public int divide(int a, int b){
        if(b == 0){
            throw new RuntimeException();
        }
        return a / b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

}
