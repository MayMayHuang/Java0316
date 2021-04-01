package com.ocp.day08;

public class MultiArrayDemo2 {
    public static void main(String[] args) {
        //int[][] m = {{100 ,90 ,80},{70,60,50}};
        int[][] m = new int [][]{{100 ,90 ,80},{70,60,50}};
        System.out.println(m.length);
        System.out.println(m);//[[I@2a139a55=>二維陣列
        System.out.println(m[0]);//[I@2a139a55=>[一維陣列,I=>int整數,@at在,地方是2a139a55(Hash code,雜湊碼=>物件所在地,無雜湊碼無地址
        System.out.println(m[1]);//[I@15db9742
        //求總分= ? 
        int sum = 0;
        for(int[] x : m ){
            for(int y : x) {
            sum += y;
            }
        } 
        System.out.println(sum);
    }
 }
