package com.ocp.day16;

public class NumberMain {
    public static void main(String[] args) {
        //Lambda實作EvenNumber, n = 50是否是偶數
        EvenNumber even = (n) -> n % 2 == 0;
        System.out.println(even.isEven(50));
        //Lambda實作PrimeNumber, n = 9973是否是質數
        
    }
    
}
