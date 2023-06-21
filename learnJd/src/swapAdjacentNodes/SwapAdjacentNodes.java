//Q) Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the 
//values in the list's nodes (i.e., only nodes themselves may be changed.)

package swapAdjacentNodes;

import java.util.Scanner;

class Node { //creating a node and passing integer value 
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }
}

public class SwapAdjacentNodes {
    
	public static Node swapAdjacentNodes(Node head) { //Nodes swapped here by passing head value as a parameter
        Node dummy = new Node(0);
        dummy.next = head;
        Node curr = dummy;

        while (curr.next != null && curr.next.next != null) {
            Node first = curr.next;
            Node second = curr.next.next;

            first.next = second.next;
            second.next = first;
            curr.next = second;

            curr = curr.next.next;
        }

        return dummy.next;
    }

	//Same protocol of printing and creating linked list
    public static void printLinkedList(Node head) { //Linked List printed here
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    public static Node createLinkedList(int[] values) { //Linked list is created here
        Node dummy = new Node(0);
        Node curr = dummy;
        for (int value : values) {
            curr.next = new Node(value); //Parsing the integer value to string
            curr = curr.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the length of the list: ");
        int n = sc.nextInt();

        int[] values = new int[n];
        System.out.print("Enter the list: ");
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }
        Node head = createLinkedList(values);

        Node swap = swapAdjacentNodes(head);

        System.out.println("After swapping the list:");
        printLinkedList(swap);

        sc.close();
    }

}

