package com.ocp.day29;

class Ball{
    public Ball() {
        String tname = Thread.currentThread().getName();
        System.out.println("Ball建立-棒球" + tname);
    }
    //商業邏輯
    void play() {
         String tname = Thread.currentThread().getName();
        System.out.println("打棒球" + tname);
    }
    //Finalize
@Override
protected void finalize() throws Throwable {
     String tname = Thread.currentThread().getName();
    System.out.println("Ball消失了"+ tname );
    }
}

public class FinalizedDemo {
    public static void main(String[] args) {
        Ball b = new Ball();
        b.play();
        b = null;
        System.gc();
    }
    
}
