package com.ocp.day06;

import java.util.Arrays;

public class ArrayBMICV {

    public static void main(String[] args) {
        String[] names = {"A", "B", "C", "D", "E"};
        double[] h = {172, 168, 164, 170, 176};
        double[] w = {62, 57, 58, 64, 64};
        Person[] persons = new Person[5];
        for (int i = 0; i < persons.length; i++) {
            //建立一個Person物件p
            Person p = new Person(names[i], h[i], w[i]);
            // 將Person物件p放入到persons[0]中
            persons[i] = p;
            //將資料p印出
            System.out.println(persons[i]);
        }
        //印出bmi值
        for (Person p : persons) {
            System.out.printf("bmi: %.1f\n", p.bmi);
        }
        //建立一個double[]bmis用來存放所有bmi的資料
        double[] bmis = new double[5];
        for (int i = 0; i < persons.length; i++) {
            bmis[i] = persons[i].bmi;
        }

        //計算bmi_cv
        System.out.println(Arrays.toString(bmis));
        double bmi_cv = MyMath.cv(bmis);
        System.out.printf("BMI C.V: %.2f%%\n", bmi_cv * 100);
    }

}

//System.out.println(com.[0].name);
    //System.out.println(persons[0]);=>null
