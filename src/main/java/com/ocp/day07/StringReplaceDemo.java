package com.ocp.day07;

public class StringReplaceDemo {
    public static void main(String[] args) {
        String s1 = "Jbvb";
        String s2 = "Java";
        //s1 = s1.replace('b', 'a');=>Java=>指向a03,建立速度快,容易產生垃圾
        s1.replace('b', 'a');//Jbvb
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);//不在池子裡面,所以false
        System.out.println(s1.equals(s2));
    }
    
}
