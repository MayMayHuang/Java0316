package com.ocp.day37_nio;

import com.sun.xml.internal.ws.server.InvokerTube;
import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilesReaderDemo {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("src/main/java/com/ocp/day37_nio/salary.txt");
        //1. Files.newBufferedReader
        try(BufferedReader reader = Files.newBufferedReader(path)){
                reader.lines().forEach(System.out::println);
        } catch (Exception e) {
            
        }
        System.out.println("----------------");
        //2. Files.readAllLines(得到List集合)
        List<String> list = Files.readAllLines(path);
        list.forEach(System.out::println);
        System.out.println("----------------");
        //3. Files.lines(得到Stream串流)
        Files.lines(path).forEach(System.out::println);
    }
}
