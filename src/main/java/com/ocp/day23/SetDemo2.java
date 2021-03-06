package com.ocp.day23;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo2 {
    public static void main(String[] args) {
        //國,英,數的分數是介於0~100之間
        Set scores = new LinkedHashSet();
        scores.add(100);
        scores.add(2000);
        scores.add(90);
        scores.add(80);
        scores.add(3.14);//3.14是double,所以filter時,delete
        scores.add(true);
        System.out.println(scores);
        //過濾資料
        Iterator iter = scores.iterator();
        while (iter.hasNext()) {//正面表列,wh List中,choose 3
            Object next = iter.next();
            if(next instanceof Integer){
                int score = (Integer)next;
                if(!(score >=0 && score <= 100)){
                    iter.remove();
                }
            } else {
                    iter.remove();
            }
        } 
        System.out.println(scores);
        //求總分
        int sum =0;
        iter = scores.iterator();//重新取得走訪器
        while (iter.hasNext()) {
            Object next = iter.next();
            if(next instanceof Integer) {//轉型時,最好有instanceof
                sum += (Integer)next;
            }
            
        }
        System.out.println(sum);
      }
   }
        
    
    

