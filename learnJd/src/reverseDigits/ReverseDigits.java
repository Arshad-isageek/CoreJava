//Q) Given a signed 32-bit integer x, return x with its digits reversed  otherwise then return 0.

package reverseDigits;

import java.util.Scanner;

public class ReverseDigits {
    public static int reverse(int x) {
        int reversed = 0;

        //Algorithm
        while (x != 0) {
            int rem = x % 10; //Eg: x = 123 => rem = 3 (initial)
            				  //Second x = 12 => rem = 2
            				  //Third x = 1 => rem = 1
            int newRes = reversed * 10 + rem; // initial -> newRes = 0 x 10 + 3 = 3 (first digit)
            								  // Second -> newRes = 3 x 10 + 2 = 32 (two digits)
            								  // third -> newRes = 32 x 10 + 1 = 321 (third digits)

            reversed = newRes; // initial -> reversed = 3
            x /= 10; // initial -> x = 12
        }

        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = sc.nextInt();

        int reversed = reverse(input);
        System.out.println("Reversed integer: " + reversed);

        sc.close();
    }
}

