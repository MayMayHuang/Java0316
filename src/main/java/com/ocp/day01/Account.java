package com.ocp.day01;

public class Account {
     private int balance;//帳戶餘額,-私有的
     
     //自行撰寫一個查詢帳戶餘額的方法
     int getBalance() {
         return balance;// return指方法停止並回傳餘額(balance)
     }
    //提款方法 
    void withdraw(int money){//提款方法=>模子
        //驗證money是否符合存款的條件
        if(money <= 0){
            System.out.println("提款金額不符");
            return;//提款方法到此結束
        }
        //驗證money是否大於balance?
        if(money > balance){
            System.out.println("帳戶餘額不足!");
            return;//提款方法到此結束!
            
        }
        balance -= money;
    }
    //存款方法
    void deposit(int money) {//存款方法=>模子
        //驗證money是否符合存款的條件
        if(money <= 0){
            System.out.println("存款金額不符!");
            return;//存款方法到此結束
        }
        balance += money;// += balance + money,這樣錢才可以累加
        
    }
    
}
