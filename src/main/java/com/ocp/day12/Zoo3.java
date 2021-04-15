package com.ocp.day12;

public class Zoo3 {
    public static void main(String[] args) {
        Cat cat = new Tiger();//對Tiger下達shout宣告
        cat.shout();
        ((Tiger)cat).hunter();//(Tiger)轉型,cat.hunter()不行,必須轉型為((Tiger)cat.hunter();
        Cat cat2 = new Cat();
        if(cat2 instanceof Tiger){
            ((Tiger)cat2).hunter();//轉型失敗    
        } else {
            System.out.println("cat2不可轉Tiger");
    }
        //((Tiger)cat2).hunter();轉型失敗
    }
    
}
