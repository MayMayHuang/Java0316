package com.ocp.day08;

public class MultiArrayDemo4 {
    public static void main(String[] args) {
        //3人的身高與體重如下:
        double[][] hw = {{170,160,180},{60,45,90}};
        //求3人的BMI(Homework)
        for(double[] x : hw) {
            for(double y: x) {
            double h = x[0];
            double w = x[1];
           double bmi = w/Math.pow(h/100, 2);
           System.out.printf("BMI: %.2f\n", bmi);
           }
        }
         
        
    
    }
  }

