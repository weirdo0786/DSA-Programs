package com.company;
import java.util.*;
public class TEST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count = 0;
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            for (int i=0;i<n;i++){
                if(arr[i]==0){
                    count++;
                }
            }
            if(count>0){
                System.out.println("It contains zero element in the given array");
            }
            else{
                System.out.println("It doesn't contain zero element in the given array");
            }
        }
    }
}
