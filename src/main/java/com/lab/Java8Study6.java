package com.lab;

import java.util.stream.Stream;

public class Java8Study6 {
    public static void main(String[] args) {
        String[] names = {"banana", "watermelon", "apple", "orange", "mango"};
        //請求出所有name長度是偶數的總和 ?
        int sum = Stream.of(names)
                  .mapToInt(String::length)//.mapToInt(s ->s.length()),::方法參考,不用s,怕用錯誤解
                  .filter(s -> s% 2 == 0)
                  .sum();
        System.out.println(sum);
        
        
    }
    
}
