package com.ocp.day23;

import java.util.LinkedHashSet;//照順序
import java.util.HashSet;//不管順序
import java.util.Iterator;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        //Set subjects = new HashSet();
        Set subjects = new LinkedHashSet();
        subjects.add("國");//String
        subjects.add("英");//String
        subjects.add(null);//null
        subjects.add("數");//String
        subjects.add(100);//Integer,Java5之後變成100
        System.out.println(subjects);
        //走訪每一個元素
        Iterator iter = subjects.iterator();
        //System.out.println(iter.next() + "," + iter.hasNext());
        while (iter.hasNext()) {
            Object next = iter.next();
            //System.out.println(next);
            if(next == null){
                iter.remove();
                continue;
            }
            if(next instanceof Integer) {
                if((Integer)next == 100) {
                iter.remove();
                }
            }
        }
        System.out.println(subjects);
    }
    
}
