package com.ocp.day16;
//class Company{
public class Dept {//外部類別
    private String name = "IT";
    public static final String companyName ="HaHa";//final=>只有一份
    //一般內部類別
    public class Stuff {
        private String name ="John";
        public void job(){
            String name = "寫程式";
            System.out.printf("%s 在%s公司的 %s部門下 %s\n",
                    this.name, Dept.companyName, Dept.this.name, name
            );//IT=>Dept,
            
        }
        
    }
        
    
    
}
