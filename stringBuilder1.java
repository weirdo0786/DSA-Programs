package com.company;
import java.util.*;
public class stringBuilder1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("Sachin");
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        // set char at index 0
        sb.setCharAt(0,'H');
        System.out.println(sb);
        // insert char
        sb.insert(6,'n');
        System.out.println(sb);
        //delete char
        sb.delete(6,7);
        sb.setCharAt(0,'S');
        System.out.println(sb);
        //appened char
        sb.append("love");
        sb.append("Shiva");
        System.out.println(sb);
        String reverse1 = "";
        for(int i=0;i<sb.length();i++){
            reverse1 = sb.charAt(i) +  reverse1;
        }
        System.out.println(reverse1);
        if(reverse1.equals(sb)){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("Not pallindrome");
        }

        // or for reverse
        for(int i=0;i<sb.length()/2;i++){
            int front = i;  // index
            int back = sb.length()-1-i;
            char frontChar = sb.charAt(front);  //char
            char backChar  = sb.charAt(back);
            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);
    }
}
