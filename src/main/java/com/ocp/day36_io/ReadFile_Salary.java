package com.ocp.day36_io;

import java.io.File;
import java.io.FileReader;

public class ReadFile_Salary {
    public static void main(String[] args) {
        File file = new File("src/main/java/com/ocp/day36_io/files/salary.txt");
        FileReader fr = null;
        try {
            fr = new FileReader(file);
            int ch = 0;
            //char[] ch = new char[1];
            //System.out.println(fr.read());
            //System.out.println(fr.read());
            //System.out.println((char)fr.read());
            //System.out.println((char)fr.read());
            while((ch = fr.read()) != -1) {
                System.out.print((char)ch);
            }
        }catch (Exception e) {
            
        } finally {
            try {
                fr.close();
            } catch(Exception e){
                
            }
            
        }
    }
    
}
