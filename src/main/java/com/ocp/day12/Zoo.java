package com.ocp.day12;

public class Zoo {
    public static void main(String[] args) {
        Cat cat = new Cat();//用這隻貓,操作這隻貓
        cat.shout();
        //cat.hunter();//因為Cat裡面沒有hunter()=>Cat cat的Cat
        Tiger tiger = new Tiger();
        tiger.shout();
        tiger.hunter();
        //多型宣告
        Cat cat2 = new Tiger();//只能限定貓的呼叫方法
        //cat2.hunter();//因為Cat裡面沒有hunter()
        cat2.shout();
    }
    
}
