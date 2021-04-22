package com.ocp.day16;

public class SevenEleven {
    //結帳方法
    public void submit(int price) {//Java7必須在int前加final
        String name = "微粒炸醬麵";
        //name = "科學麵";
        //交易類別
        class Transaction {
            //交易資料
            void print() {
                System.out.printf("%s 交易金額: %d\n", name, price);
            }
        }
        Transaction t = new Transaction();
        t.print();
    }
    public static void main(String[] args) {//獨立於上面結構之外
        SevenEleven se = new SevenEleven();
        se.submit(100);
    }
}
