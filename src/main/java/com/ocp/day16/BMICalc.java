package com.ocp.day16;

public class BMICalc {
    public static void main(String[] args) {
        //利用Lambda實作BMI介面
        //h = 170, w = 60 求bmi=?
        BMI bmi = (double h, double w) -> w / Math.pow(h/100,2);
        System.out.println(bmi.getResult(170, 60));
    }
    
}
