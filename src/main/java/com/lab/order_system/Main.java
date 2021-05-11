package com.lab.order_system;

import static com.ocp.day11.Main.menu;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Food> orders = new ArrayList<>();
    private static DataCenter dc = new DataCenter();
    private static ServiceCenter sc = new ServiceCenter();
    private static boolean play = true;
    
    public static void main(String[] args) throws Exception {
        menu();
    }
    
    public static void menu() {
        sc.menu();
        System.out.println("請輸入: ");
        Scanner scanner = new Scanner(System.in);
        int itemId = scanner.nextInt();
        switch(itemId) {
            case 1:
                sc.printCatalog();
                break;
            case 2:
                System.out.print("請輸入No: ");
                int addNo = scanner.nextInt();
                Food food = sc.getFoodbyNo(addNo);
                orders.add(food);
                break;
            case 3:
                for( int i=0; i<orders.size();i++) {
                    System.out.printf("id: %d %s\n",i, orders.get(i));
                }
                break;
            case 4:
                System.out.print("請輸入取消id:");
                int cancelId = scanner.nextInt();
                orders.remove(cancelId);
                break;
            case 5:
                orders = new ArrayList<>();
                break;
            case 6:
                int sum = orders.stream().mapToInt(Food::getPrice).sum();
                System.out.printf("結帳: %d\n",sum);
                play = false;
                break;
            case 0:
                play = false;
        }
        
        
    }
    
}
