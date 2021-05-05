package com.lab.pig;

import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        Stream.of(Util.getPigs())
                //.filter(r -> r.getAddr().contains("桃園"))
                .forEach(System.out::println);
        //將指定不合格的米放入集合中
        List badPig = Stream.of(Util.getPigs())
                //.filter(r -> r.getAddr().contains("桃園"))
                .collect(toList());//將不合格的米收集到一個list集合中
        System.out.printf("家數: %d, 內容: %s\n", badPig.size(),badPig);
    }
            
    
}
