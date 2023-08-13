package com.company;
import java.util.*;
public class containsDuplicacy {
    // 1 5 -2 -4 0 ---> Doubt in this Value, How it returns true.
    public static boolean containsDuplicate(int[] nums){
        int n = nums.length;
        if(n==1){
            return false;
        }
        for(int i=0;i<n;i++){
            for (int j = i+1; j<n;j++){
                if(nums[i]==nums[j]){
                    return true;
            }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(containsDuplicate(nums));
    }
}
