package com.ocp.day13;

public class Epet extends Pet {

    @Override
    public void move() {
        System.out.println("震動");
    }
    @Override
    public void eat() {
        System.out.println("吃電");
    }
    
}
