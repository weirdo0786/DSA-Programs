package com.company;

import java.util.Scanner;

public class Main
{
    public static int [] swap(int[] arr)
    {
        for(int i = 0; i < arr.length; i = +2)
        {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        return arr;
    }
    public static void printallPairs (int k[])
    {
        for (int i = 0; i < k.length; i++)
        {
            System.out.print(k[i]);
        }

    }

    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
//        int arr[] = { 5, 6, 3, 4, 9, 2 };
        int k[] = swap(arr);
        printallPairs(k);
    }
}
