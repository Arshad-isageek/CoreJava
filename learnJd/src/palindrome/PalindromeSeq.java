package palindrome;

import java.util.Scanner;

public class PalindromeSeq {
    public static String longestPalindrome(String str) {
        boolean[][] check = new boolean[str.length()][str.length()];
        int maxL = 1;
        int start = 0;
        
        // if single character
        for (int i = 0; i < str.length(); i++) {
            check[i][i] = true;
        }

        // if the string has 2 characters
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                check[i][i + 1] = true;
                maxL = 2;
                start = i;
            }
        }

        // if the string has more than two characters
        for (int l = 3; l <= str.length(); l++) {
            for (int i = 0; i < str.length() - l + 1; i++) {
                int j = i + str.length() - 1;
                if (str.charAt(i) == str.charAt(j) && check[i + 1][j - 1]) {
                    check[i][j] = true;
                    maxL = l;
                    start = i;
                }
            }
        }

        return str.substring(start, start + maxL);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String longestPalindromicSubstring = longestPalindrome(input);
        System.out.println("Longest palindromic substring: " + longestPalindromicSubstring);

        scanner.close();
    }
}


