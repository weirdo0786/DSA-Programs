package com.company;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
public class mergeFile {
    public static void main(String[] args) throws IOException {
        //create a printwriter object for file3
        PrintWriter pw = new PrintWriter("file3.txt");
        //create a bufferedreader object for file1
        BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
        String line1 =  br1.readLine();
        //loop to copy eachh line of file1 to file3
        while ((line1 !=null)){
            pw.println(line1);
            line1 = br1.readLine();
        }
        //create a bufferedreader object for file2
        BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));
        String line2 =  br2.readLine();
        //loop to copy eachh line of file1 to file3
        while ((line2 !=null)){
            pw.println(line2);
            line2 = br2.readLine();
        }
        pw.flush();
        br1.close();
        br2.close();
        pw.close();
        System.out.println("merge a file1.txt and file2.txt into file3.txt");
    }
}
