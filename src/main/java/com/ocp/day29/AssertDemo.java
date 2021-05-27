package com.ocp.day29;

public class AssertDemo {
    public static void main(String[] args) {
        
        int score = 400;
        
        //1.設定Main class
        //2.加入 -ea
        //3.找出問題後要把assert拔除
        //assert(score >= 0 && score<= 100):"分數錯誤" + score;
        if(score >= 0 && score <=100) {
        System.out.println(score >=60?"Pass":"Fail");
        } else {
            System.out.println("分數錯誤");
         }
        }
         
    
}
