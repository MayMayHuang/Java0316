package com.ocp.day36_io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
//Download讀取->寫檔
public class DownloadImage_via_http {
    public static void main(String[] args) throws Exception {
        String path = "https://ichef.bbci.co.uk/news/976/cpsprodpb/C448/production/_117684205_lotus.jpg";
        URL url = new URL(path);
        
        String savePath = ("src/main/java/com/ocp/day36_io/files/car.jpg");
        try (InputStream is = url.openConnection().getInputStream();
             FileOutputStream fos = new FileOutputStream(savePath, false);){
               //byte[] chs = new byte[is.available()];//available()資料長度
        //is.read(chs);//將資料寫進chs陣列
        //FileOutputStream fos = new FileOutputStream("src/main/java/com/ocp/day36_io/files/car.jpg",false);//累進的寫進去
        
        int ch = 0;
        //邊讀邊寫
        while((ch = is.read())!= -1) {//邊讀
        System.out.println(ch);
        fos.write(ch);//邊寫
       }
     } catch (Exception e){
    }
   }
}
