package com.ocp.day06;

public class MyMath {
    //求總數
    public static double sum(double [] nums) {//sum要一個double num的陣列,int就錯,除非CV2是用int
        int sum = 0;
        for(double n: nums){
            sum +=n;
        }
        return sum;//回報呼叫者=>CV2sum
    }
    //求平均
    public static double avg(double [] nums) {
        double sum = sum(nums);
        double n = nums.length;//幾筆資料
        double avg =sum / n;
        return avg;
        
    }
    //求標準差
    public static double  sd(double [] nums) {
        double avg =avg(nums);
        double sumOfSqares = 0;
        for(double n:nums) {
            sumOfSqares += Math.pow(n-avg, 2);
        }
        int n = nums.length;
        double sd = Math.sqrt((1.0/n)*sumOfSqares);
        return sd;
    }
   //求變異係數
    public static double  cv(double [] nums) {
        double avg = avg(nums);
        double sd = sd(nums);
        double cv = sd/avg;
        return cv;
        
        
    }
    //求最大值
    
}
