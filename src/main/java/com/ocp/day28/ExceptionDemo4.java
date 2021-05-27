package com.ocp.day28;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        int[] nums = {10};//null,{10},{10,0}
        try {
          int avg = nums[0] / nums[1];
          System.out.println(avg);
        } catch (ArithmeticException e) {
            System.out.println("數學錯誤, 錯誤原因:" + e.getMessage());
        } catch (Exception e) {
            System.out.println("其他錯誤, 錯誤原因:" + e);
        //先寫子類別(ArithmeticException),再寫父類別(Exception);先寫父類別,子類別的條件Java認為在父類別已執行了,子類別條件多餘
        
    }
    }         
    
    }
