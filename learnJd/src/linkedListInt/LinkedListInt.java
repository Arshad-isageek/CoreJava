//Q) You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, 
//and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

package linkedListInt;

import java.util.Scanner;

class Node { //creating node and passing value to node
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }
}

public class LinkedListInt {
	
    public static Node createNewList(int[] nums) { //New linked list of return type node created
        Node ref = new Node(0);
        Node current = ref;

        for (int i : nums) {
            current.next = new Node(i);
            current = current.next;
        }

        return ref.next;
    }
	
    public static Node linkedListInt(Node n1, Node n2) { //linked list of return type node 
        Node ref = new Node(0);
        Node current = ref;
        int check = 0;

        while (n1 != null || n2 != null) { //Basic looping
            int sum = check;
            if (n1 != null) {
                sum += n1.value;
                n1 = n1.next;
            }
            if (n2 != null) {
                sum += n2.value;
                n2 = n2.next;
            }

            int val = sum % 10; //stores value for remainder of sum
            current.next = new Node(val); //the value given to next node
            check = sum / 10; //check reduces to 1/10th of it og value
            current = current.next;
        }

        if (check > 0) {
            current.next = new Node(check);
        }

        return ref.next;
    }
    
    public static void printThatList(Node head) { //printing the list in main once called
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println(); //Next Line
    }

    public static void main(String[] args) {
    	
    	
//    	int[] n1 = {2,4,3};
//    	int[] n2 = {5,6,4};
//    	Node l1 = createNewList(n1);
//    	Node l2 = createNewList(n2);
//    	
//    	Node res = linkedListInt(l1,l2);
//    	printThatList(res);
    	
    	Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of first List: ");
        int n1 = sc.nextInt();
        int[] len1 = new int[n1];
        System.out.print("Enter the list: ");
        for (int i = 0; i < n1; i++) {
            len1[i] = sc.nextInt();
        }
        Node l1 = createNewList(len1); //created linkedlist l1

        System.out.print("Enter the length of the second list: ");
        int n2 = sc.nextInt();
        int[] len2 = new int[n2];
        System.out.print("Enter the list: ");
        for (int i = 0; i < n2; i++) {
            len2[i] = sc.nextInt();
        }
        Node l2 = createNewList(len2); //created linkedlist l2

        Node result = linkedListInt(l1, l2); //result = linkedlist l1 + l2

        System.out.print("Sum: "); //sum=result
        printThatList(result);
        sc.close();
    } 
}