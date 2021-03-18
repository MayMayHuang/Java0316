package com.ocp.day02;

public class BMICase3 {//主程式是管理物件
    public static void main(String[] args) {
      BMI b1 = new BMI("小明",170, 60);//物件1,用的是"建構子",new BMI之後有帶3個參數
      BMI b2 = new BMI("小英",160, 50);//物件2  
      
      b1.print();
      b2.print();
    }
    
    
        
    
        
    
}
