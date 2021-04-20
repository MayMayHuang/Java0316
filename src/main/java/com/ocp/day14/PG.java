package com.ocp.day14;

public class PG extends Employee {

    public PG() {//建構子
    }

    public PG(int salary) {//建構子
        super(salary);
    }
    
    

    @Override//實作
    public void job() {
        System.out.println("寫程式");
    }
    
}
