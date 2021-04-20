package com.ocp.day13;

public interface Animal {// 建立規格
    int legs = 4;//屬性不可變,系統直接加public static final,不可加private=>規格一定要公開
    void eat();//public abstract=>不完全,抽象
    void move();
}
