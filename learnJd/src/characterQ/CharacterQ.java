//Q) Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

package characterQ;

import java.util.Scanner;
import java.util.Stack;

public class CharacterQ{
    public static boolean isValid(String s){
        Stack<Character> st = new Stack<>(); //java.lang.Character
        //Stack is one of the data structures used to write algorithms

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (st.isEmpty()) {
                    return false;
                }
                
                char top = st.pop();
                
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("s = ");
        String input = scanner.nextLine();

        boolean isValid = isValid(input);
        System.out.println(isValid);

        scanner.close();
    }
}

