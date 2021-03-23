package com.ocp.day06;

import java.util.Arrays;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] scores = new int[3];
        scores[0] = 100;
        scores[1] =  90;
        scores[2] =  90;
        int lens = scores.length;//取得陣列長度
        System.out.printf("陣列長度: %d\n", lens);
        //印出陣列每一個元素資料
        System.out.println("[" + scores[0] + ", " + scores[1] + ", " + scores[2] + "]");
        System.out.println(Arrays.toString(scores));//印出陣列
        //總分
        int sum = scores[0] + scores[1] + scores[2];
        //平均
        //double avg = sum / lens;//除出來是93.0,非93.3,問題是在有=,右邊先做,ex:1/2=0,若是1.0/2=0.5
        double avg = (double) sum / lens;
        System.out.printf("總分: %d 平均: %.1f\n",sum,avg);
        
    }
    
}
