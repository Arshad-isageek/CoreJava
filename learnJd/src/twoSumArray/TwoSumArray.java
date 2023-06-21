//Q) Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

package twoSumArray;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSumArray {

	//static used to provide static reference to main method
	//Creating twoSumArray method with return type integer array to take two inputs
    public static int[] twoSumArray(int[] nums, int target) throws NullPointerException{
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int n = target - nums[i];
            if (numMap.containsKey(n)) {
                return new int[]{numMap.get(n), i}; 
            }
            numMap.put(nums[i], i);
        }
		return nums;
    }

    public static void main(String args[]) {
    	
//    	int[] nums = {2, 7, 11, 15};
//    	int target = 9;
    	int[] nums = {3,2,4};
        int target = 6;
    	
    	int[] twoS = twoSumArray(nums,target);
    	System.out.println(twoS[0] + ","+ twoS[1]);
    	
//    	Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number of elements in the array: ");
//        int len = sc.nextInt();
//
//        int[] nums = new int[len];
//        System.out.println("Enter the elements of the array:");
//        for (int i = 0; i < len; i++) {
//            nums[i] = sc.nextInt();
//        }
//
//        System.out.print("Enter the target sum: ");
//        int target = sc.nextInt();
//
//        int[] result = twoSumArray(nums, target);
//
//        System.out.println("[" + result[0] + ", " + result[1] + "]");
//        
//        sc.close();
    }
}
