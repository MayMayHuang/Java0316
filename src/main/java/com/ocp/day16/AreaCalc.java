package com.ocp.day16;

public class AreaCalc {
    public static void main(String[] args) {
        double r = 15.0;
        //CircleArea ca = new CircleArea();
        CircleArea ca = new CircleAreaImpl();
        System.out.println(ca.getArea(r));
        //匿名內部類別
        CircleArea ca2 = new CircleArea(){
            @Override
            public double getArea(double r) {
                return r * r * Math.PI;
            }
        };
        System.out.println(ca2.getArea(r));
        //匿名內部類別(圓體積)
        CircleArea ca3 = new CircleArea() {
            @Override
            public double getArea(double r) {
                return 4.0/3 * Math.pow(r, 3) * Math.PI;
            }
        };
        System.out.println(ca3.getArea(r));
        
    }
    
}
