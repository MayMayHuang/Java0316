package com.ocp.day12;

public class Zoo2 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        playShout(tiger);
        Cat cat = new Cat();
        playShout(cat);
        Cat cat2 = new Tiger();
        playShout(cat2);
        
    }
    //public static void playShout(Cat x){
    //    x.shout();
    //}
    public static void playShout(Cat x){//如果是Tiger,playShout(cat)就不行
        x.shout();
    }
}
