package com.ocp.day17;

import java.util.DoubleSummaryStatistics;
import java.util.stream.Stream;

public class LambdaDemo2 {
    public static void main(String[] args) {
        //求此人總分與平均 = ?
        DoubleSummaryStatistics stat = Stream.of("國文", 100.0, "英文", 90.5, "數學", 70.5, "座號", 7)
              .filter(x -> x instanceof Double)
              .mapToDouble(x -> (double)x)//轉成基本資料型別,物件Double轉基本double才會變成DoubleStream
              //.peek(x -> System.out.println(x.getClass().getTypeName()))
              .summaryStatistics();
              //.forEach(System.out::println);
              System.out.println(stat.getSum());
              System.out.println(stat.getAverage());
    }
    
}
