package com.example.demo.bujibi;

public class DemoChild extends Demo {
    @Override
    void hmm() {
        System.out.println("hmm from demo child");
    }

    @Override
    String hello() {
        return "Say hello";
    }

}
