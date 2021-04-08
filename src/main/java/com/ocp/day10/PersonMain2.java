package com.ocp.day10;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PersonMain2 {

    public static void main(String[] args) {
        Person[] persons = {//陣列
            new Person("John", 17, 170, 60.5),
            new Person("Mary", 18, 160, 50.5),
            new Person("Jo", 19, 155, 42.5),
            new Person("Helen", 16, 185, 75.5),
            new Person("Tom", 21, 190, 120.5),
        };
        //建立BMI的資料計算邏輯,使用Function<T,R>
        //參考api:https://docs.oracle.com/javase/8/docs/api/java/util/function/Function.html
        //T代表傳入參數,在這邊指的就是Pesron物件也就是p
        //R代表回傳資料型別,在這邊指的就是Double 也就是bmi的計算結果
        Function<Person, Double> getBMI = p -> p.getWeight() / Math.pow(p.getHeight()/100, 2);//函式lamda,回傳為Double
        //正常bmi的過濾器 Predicate<Person>
        //getBMI.apply(p)取得getBMI的計算結果
        Predicate<Person> normalBmi = p ->getBMI.apply(p) > 18 && getBMI.apply(p) <=23;//predicate回傳一律是boolean值
        //印出人名
        Consumer<Person> printName = p ->System.out.println(p.getName());
        //印出正常bmi的人名
        Stream.of(persons).filter(normalBmi).forEach(p ->System.out.println(p.getName()));//forEach=>消費,無回傳值
    }     
}
