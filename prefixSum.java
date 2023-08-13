package com.company;
import java.util.*;
public class prefixSum {
    public static int[] prefixSum1(int[] arr){
        int n = arr.length;
//        int sum = 0;
        for(int i=1;i<n;i++){
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
//        int x = sc.nextInt();
        int result[] = prefixSum1(arr);
        System.out.println(result);
        for(int i=0;i<n;i++){
            System.out.print(result[i]+" ");
        }
    }
}
