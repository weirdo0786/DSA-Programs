package com.company;
import java.util.*;
public class binarySearch {
    public static int binarySearch1(int[] arr, int x){
        int start = 0;
        int n = arr.length;
        int last = n - 1;
        while (start <= last) {
            int mid = (start + last) / 2;
            if (x < arr[mid]) {
                last = mid - 1;
            } else if (x > arr[mid]) {
                start = mid + 1;
            } else if (x == arr[mid]) {
                return mid;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int res = binarySearch1(arr,x);
        System.out.println(res);
    }
}
