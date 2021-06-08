package com.ocp.day30_thread;

class Race implements Runnable {

    @Override
    public void run() {
        String tname = Thread.currentThread().getName();
        for(int i=1;i<=1000;i++){
            System.out.printf("%s 跑了 %d步\n", tname,i);
        }
    }
    
}
public class ThreadDemo2 {
    public static void main(String[] args) {
        Thread rabbit = new Thread(new Race(), "兔子");
        Thread turtle = new Thread(new Race());
        turtle.setName("烏龜");
        rabbit.setPriority(Thread.MIN_PRIORITY);//1
        turtle.setPriority(Thread.MAX_PRIORITY);//10,最多10,11就是參數錯誤
        System.out.println(rabbit.getPriority());
        System.out.println(turtle.getPriority());
        
        turtle.start();
        rabbit.start();
    }
    
}