//Q) Given an integer x, return true if x is a palindrome, and false otherwise.

package palindromeOrNot;

import java.util.Scanner;

public class PalindromeOrNot {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
        	throw new NegativeArraySizeException("Dont put any negative number"); //Gives an exception for negative input
        }else if (x % 10 == 0 && x != 0) {
        	return false;
        }

        int reverse = 0;
        int og = x;

        while (x != 0) { //Algorithm
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x /= 10;
        }

        return og == reverse; //This will return whether original = reversed integer or not
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        System.out.print("x: ");
        int input = sc.nextInt();

        boolean isPalindrome = isPalindrome(input);
        System.out.print("Ans:");
        System.out.println(isPalindrome);

        sc.close();
    }
}
