package com.ocp.day01;

public class Account {
    int balance;//帳戶餘額
    void withdraw(int money){//提款方法=>模子
        balance -= money;
    }
    void deposit(int money) {//存款方法=>模子
        balance += money;// += balance + money,這樣錢才可以累加
        
    }
    
}
