//Q) Longest Substring Without Repeating Characters

package longSubString;

import java.util.HashSet;

public class LongSubString {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int i = 0;
        int j = 0;
        HashSet<Character> set = new HashSet<>();

        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))) { //If the SET 'DOES NOT' contains the CHAR AT the STRING then...
                set.add(s.charAt(j));
                j++;
                maxLength = Math.max(maxLength, j - i);
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        int length = lengthOfLongestSubstring(input);
        System.out.println("Length of the longest substring without repeating characters: " + length);
    }
}
