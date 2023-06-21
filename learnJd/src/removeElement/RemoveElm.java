//Q) Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements 
//may be changed. Then return the number of elements in nums which are not equal to val.
//Consider the number of elements in nums which are not equal to val be k, to get accepted,

package removeElement;

import java.util.Scanner;

public class RemoveElm {
    public static int removeElm(int[] nums, int val) {
        int count = 0; 
        //variable count will store the count of the elements that is not equal to value
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++; //iterating until length of nums and only if nums array is not equal to value, then nums[k]=nums[i]
            }
        }

        int k = count;
        return k; //This will return k once the static method reference is called
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter the value to remove: ");
        int val = scanner.nextInt();

        int k = removeElm(nums, val);

        System.out.print("nums = [");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.print("]");
        System.out.println();

        System.out.println("k = " + k);

        scanner.close();
    }
}

