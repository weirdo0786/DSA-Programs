package com.company;
import java.util.*;
public class singleNumber {
    public static int number(int[] nums, int n){
        int count = 1;
        int res = 0;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==1){
                res = nums[i];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
       int val =  number(nums,n);
        System.out.println(val);
    }
}
