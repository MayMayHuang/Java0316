package com.ocp.day05;
import com.ocp.day05.util.Calc;//手key
//import static com.ocp.day05.util.Calc.*; //*昰指類別,代表+-*/
import static com.ocp.day05.util.Calc.add;
import static com.ocp.day05.util.Calc.sub;
import static com.ocp.day05.util.Calc.mul;
import static com.ocp.day05.util.Calc.div;
public class CalcTest {
    public static void main(String[] args) {
        System.out.println(Calc.add(20,10));
        System.out.println(Calc.sub(20,10));
        System.out.println(Calc.mul(20,10));
        System.out.println(Calc.div(20,10));
        //省去撰寫Calc的麻煩
        System.out.println(Calc.add(20,10));
        System.out.println(Calc.sub(20,10));
        System.out.println(Calc.mul(20,10));
        System.out.println(Calc.div(20,10));

        
    }
    
}
