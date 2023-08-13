package com.company;
import java.util.*;
public class maxSubArray {
    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = 0;
        int min = 0;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                min = min + nums[i];
            }
            else{
                max = max + nums[i];
            }
        }
        return max+min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int val = maxSubArray(nums);
        System.out.println(val);
    }
}
