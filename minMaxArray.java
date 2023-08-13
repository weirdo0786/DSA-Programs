package com.company;
import java.util.*;
public class minMaxArray {
    public static void arrayMinMax(int arr[], int n){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            if(min>arr[i]){
                min = arr[i];
            }
            else{
                max = arr[i];
            }
        }
        System.out.println("Max value is "+max+" "+ "&"+" "+" Min value is "+ min);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
       arrayMinMax(arr,n);
    }
}
