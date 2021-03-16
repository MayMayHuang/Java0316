package com.ocp.day01;

public class Bank {//銀行管理帳戶
    public static void main(String[] args) {
        Account a01 = new Account();// 建立 a01 帳戶
        Account a02 = new Account();// 建立 a02 帳戶
        Account a03 = new Account();// 建立 a03 帳戶
        a01.balance = 1000;
        a02.balance = 2000;
        a03.balance = 3000;
        System.out.printf("a01 帳戶餘額: $%,d\n",a01.balance);//,為千分位
        System.out.printf("a02 帳戶餘額: $%,d\n",a02.balance);
        System.out.printf("a03 帳戶餘額: $%,d\n",a03.balance);
        //存款
        System.out.println("a01 存款500元後...");
        a01.deposit(500);//()中為放數字,若沒改Account int money,無法累加
        System.out.printf("a01 帳戶餘額: $%,d\n",a01.balance);
        //提款
        System.out.println("a02 存款800元後...");
        a02.withdraw(800);
        System.out.printf("a02 帳戶餘額: $%,d\n",a02.balance);
    }
    
}
