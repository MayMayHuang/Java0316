package com.ocp.day23;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo4 {
    public static void main(String[] args) {
        //國,英,數的分數是介於0~100之間
        Set<Integer> scores = new LinkedHashSet<>();//第一個<>不可寫object,第二個<>可省略Integer
        scores.add(100);
        scores.add(200);
        scores.add(90);
        scores.add(-150);
        scores.add(80);
        System.out.println(scores);
        //請用Java 8 計算國,英,數的總數
        int sum = scores.stream()
                       //.filter(score -> score >=0 && score <= 100)
                       .filter(Score::isValid)
                       .mapToInt(Integer::intValue)
                       .sum();
        System.out.println(sum);
    }
    
}
