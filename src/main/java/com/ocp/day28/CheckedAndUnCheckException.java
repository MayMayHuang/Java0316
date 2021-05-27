package com.ocp.day28;

/*
Checked Exception:受檢例外=>throws Exception=>方法第一行做定義=>try catch
UnChcked Exception: 非受檢例外(Error, RuntimeException)
一遇到不是立即停止程式(Error,ex:記憶體不足)就是程式碼不夠堅固
立即停止:Error
程式碼不夠堅固:RuntimeException=>不定義throws RuntimeException,不寫throws

 */
public class CheckedAndUnCheckException {
    public static void main(String[] args) {
        int x = 10;
        int y =0;
        if(y!= 0) {//避免ArithmeticException的發生
        int avg = x/y;
        System.out.println(avg);
        }
        int[] nums = {};
        if(nums != null){//避免NullPointerException的發生
            if(nums.length > 0) {//避免ArrayIndexOutOfBoundsException的發生
        System.out.println(nums[0]);
            }
        }
    }
}
