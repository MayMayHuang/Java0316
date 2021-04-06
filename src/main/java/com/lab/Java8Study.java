package com.lab;

import java.util.stream.IntStream;

public class Java8Study {
    public static void main(String[] args) {
        int[] scores = {80,50,70,90,40};
        //請印出所有成績?
        //java 7
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        for (int s : scores) {
            System.out.println(s);
        }
        //java 8 (利用Stream.of()來進行資料分析)=>支援無限大資料運用
        IntStream.of(scores).forEach(s ->System.out.println(s));
        IntStream.of(scores).forEach(System.out::println);//::方法參照,簡化寫法,不曝露s

    }
    
}
