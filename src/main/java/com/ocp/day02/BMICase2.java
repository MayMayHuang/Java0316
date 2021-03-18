package com.ocp.day02;

public class BMICase2 {
    public static void main(String[] args) {
        BMI b1 = new BMI();//物件1,new BMI()沒帶任何參數進去
        b1.name ="小明";
        b1.height = 170;
        b1.weight = 60;
        
        BMI b2 = new BMI();
        b2.name = "小英";
        b2.height = 160;
        b2.weight = 50;
        
        b1.print();
        b2.print();
    }
    
}
