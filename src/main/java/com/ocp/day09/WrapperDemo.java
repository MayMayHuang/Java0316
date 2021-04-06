package com.ocp.day09;

import jdk.internal.org.objectweb.asm.commons.StaticInitMerger;

public class WrapperDemo {
    public static void main(String[] args) {
        //取得int的最大值
        int max = Integer.MAX_VALUE;
        System.out.printf("int 的最大值: %d\n",max);
        int max2 = Integer.max(10, 20);
        System.out.printf("10與20的最大值: %d\n",max2);
        String chinese = "100";
        String english = "90";
        System.out.printf("總分: %s\n",chinese + english);
        System.out.printf("總分: %s\n",Integer.parseInt(english)+Integer.parseInt(chinese));

    }
    
}
