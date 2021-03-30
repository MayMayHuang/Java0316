package com.ocp.day07;

public class StringEquals3 {
    public static void main(String[] args) {
        String s1 ="Java";
        String s2 ="Java";
        System.out.println(s1 == s2);//字串最好用equals比較,不要用==,有風險
        //s1 = s1 + "8";//池子外面
        //s2 = s2 + "8";//池子外面
        s1 = s1.concat("8");//s1 +"8"
        s2 = s2.concat("8");//s2 +"8"
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);//no,因為不在池子裡
        System.out.println(s1.intern() == s2.intern());//放入池子裡
        
        
                
    }
    
}
