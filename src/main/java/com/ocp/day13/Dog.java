package com.ocp.day13;

public class Dog extends Pet {

    //@Override//實作,複寫
    //public void eat() {
    //    System.out.println("飼料");
    //}

    @Override
    public void move() {
        System.out.println("跑");
    }
    
}
