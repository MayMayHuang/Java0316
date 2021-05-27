package com.ocp.day29;

//用來計算面積的類別
public class Square {
    public int getArea(int top, int bottom, int h) {
        int area = ((top + bottom)) * h / 2;
        return area;
    }
}
