package com.company;
import java.util.*;
public class string1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "hi";
        String str2 = "I'm";
        String str3 = "Jarvis and ";
        String str = sc.next(); // for taking onl single word like hello or jarvis.
        sc.nextLine();
        String str4 = sc.nextLine();  //for taking all string values
        System.out.println(str1+" "+str2+" "+str3+" "+str4);   //concatenation...
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str4.length());
        for (int i = 0; i <str4.length(); i++) {
            System.out.print(str4.charAt(i)+" ");
        }
        //for comparison
        System.out.println();
        if(str1.compareTo(str2)==0){
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings are not equal");
        }


        // substrings concept--->

        String word = " my name is Sachin ???";
        String name = word.substring(9,word.length());
        System.out.println(name);
    }
}
