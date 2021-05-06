package com.ocp.day23;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo3 {
    public static void main(String[] args) {
        //泛型<> : 型別限定=>Integer
        Set<Integer> scores = new LinkedHashSet<Integer>();//第一個<>不可寫object,第二個<>可省略Integer
        scores.add(100);
        scores.add(90);
        scores.add(80);
        System.out.println(scores);
        Iterator<Integer> iter = scores.iterator();
        int sum = 0;
        while (iter.hasNext()) {
            Integer next = iter.next();//直接給Integer
            sum += next;
        }
        System.out.println(sum);
        //Java 8,每個都有stream去呼叫串流
        sum = scores.stream().mapToInt(score -> score.intValue()).sum();//score ->score(自動呼叫intValue
        System.out.println(sum);
        sum = scores.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
    
}
