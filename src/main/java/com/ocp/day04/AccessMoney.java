package com.ocp.day04;
import com.ocp.day04.bar.Money;//手key
//import com.ocp.day04.foo.Money;//手key
public class AccessMoney {
    public static void main(String[] args) {
        Money m1 = new Money();
        System.out.println(m1.amount);
        //打上完整路徑
        com.ocp.day04.foo.Money m2 = new com.ocp.day04.foo.Money();//fully qualified file name
        System.out.println(m2.amount);
        
        System.out.println(m1.amount + m2.amount);
        
        
        
    }
    
}
