package com.company;
import java.util.*;
public class funCode {
    public static int takeInput(){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        return t;
    }
    public static int[] takeArray(int[] arr, int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static int[] swapValues(int[] arr, int n){
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        Arrays.sort(arr);
        System.out.println("Total even number of this array is : "+count);
        System.out.println("Total odd number f this array is : "+(n-count));
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2 !=0){
                System.out.print(arr[i]+" ");
            }
        }

        return arr;
    }
    public static boolean searchInArray(int[] arr, int x){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int n = takeInput();
        System.out.println("Value of n is : "+n);
        int[] arr = new int[n];
        takeArray(arr,n);
        swapValues(arr,n);
        System.out.println();
        for(int key : arr){
            System.out.print("Original Value of array is "+key+" ");
            System.out.println();
        }
        System.out.println("Search the value of x");
        int x = takeInput();
        boolean flag = searchInArray(arr,x);
        if(flag){
            System.out.println(x+" is present in the given array");
        }
        else{
            System.out.println(x+" is not present in the given array");
        }
    }
}
