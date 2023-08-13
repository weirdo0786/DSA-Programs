package com.company;
import java.util.*;
public class threeDivisors {
    public static  boolean threeDiv(int n) {
        int[] arr = new int[10];
        for(int i=1;i<=n;i++){
            if(n%i==0){
                arr[i] = i;
            }
        }
        int count =0;
        for (int i=1;i<=n;i++){
            if(arr[i] !=0){
                count++;
            }
        }
        if(count==3){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = threeDiv(n);
        if(flag){
            System.out.println("Yes");
        }
        else {
            System.out.println("NO");
        }
    }
}
