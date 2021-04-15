package com.ocp.day12;

public class Tiger extends Cat {

    @Override//覆寫,可不用
    public void shout() {
        System.out.println("吼");
     
    }
    public void hunter() {
        System.out.println("獵殺");
    }
    
}
