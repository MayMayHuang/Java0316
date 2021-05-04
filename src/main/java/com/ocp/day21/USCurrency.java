package com.ocp.day21;

//PENNY一美分, NICKLE五美分, DIME十美分, QUARTER25美分

public enum USCurrency {
    PENNY(1),
    NICKLE(5),
    DIME(10),
    QUARTER(25);
    private int value;
    
    private USCurrency(int value) {//private不可New,private不寫就是private,public不行
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }
    
}
