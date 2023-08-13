package com.company;
import java.util.*;
public class stringRepetition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder (str);
        int i, j;
        for (i = 0; i < sb.length (); i++)
        {
            for (j = i + 1; j < sb.length (); j++)
            {
                if (sb.charAt (i) == sb.charAt (j))
                {
                        sb.deleteCharAt(i);
                        sb.deleteCharAt(j);
                }

            }
        }
        System.out.println (sb.toString ());
    }
}
