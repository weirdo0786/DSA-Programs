package com.company;
import java.util.*;
public class duplicateZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] == 0) {
                    for (int j = arr.length-1 ; j > i; j--) {
                        arr[j] = arr[j-1];
                    }
                }
            }

            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k]+" ");
            }
//            System.out.println(arr.length-1);




//            String[] strArray = new String[arr.length];
//            for (int i = 0; i < arr.length; i++) {
//                strArray[i] = String.valueOf(arr[i]);
//            }
//            String val = "0";
//            for (int i=0;i<strArray.length;i++){
//                if(arr[i]==0){
//                    strArray[i] =strArray[i]+" "+ val;
//                }
//            }
//            for (int i=0;i<strArray.length;i++){
//                System.out.print(strArray[i]+" ");
//            }




//            System.out.println(strArray.length);
//            System.out.println(count);
//            int size = strArray.length;
//            int [] arr1 = new int [size];
//            for(int i=0; i<size; i++) {
//                arr1[i] = Integer.parseInt(strArray[i]);
//            }
//            for (int i=0;i<size;i++){
//                System.out.print(arr1[i]+" ");
//            }
//            System.out.println(Arrays.toString(arr1));
        }
    }
}
