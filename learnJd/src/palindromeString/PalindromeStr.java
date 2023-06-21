package palindromeString;

import java.util.Scanner;

public class PalindromeStr {

	public static boolean isPalindromString(String str) {
	
		String reverse = "";
		String og = str;  
		og = og.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(og); //cannot ignore the commas - have to check
		
		for (int i = og.length() - 1; i>=0; --i) {
			reverse = reverse + og.charAt(i);
		}
		System.out.println(reverse);
		
		if(og.toLowerCase().equals(reverse.toLowerCase())) {
			return true;
		}
		return false;

	}
	
	public static void main(String args[]) {
		
		System.out.println("Enter the string:");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		System.out.println(isPalindromString(st));
		sc.close();
	}
	
}
