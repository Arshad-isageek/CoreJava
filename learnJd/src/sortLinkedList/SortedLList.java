//Q) You are given the heads of two sorted linked lists list1 and list2.
//Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

package sortLinkedList;

import java.util.Scanner;

class Node { //create node that can take a value 
    int val; 
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class SortedLList {
    public static Node sortLLists(Node l1, Node l2) {
        Node ref = new Node(0);
        Node current = ref;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        if (l1 != null) {
            current.next = l1;
        }

        if (l2 != null) {
            current.next = l2;
        }

        return ref.next;
    }

    public static void printLinkedList(Node head) { //This will print the linked list
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    public static Node createLinkedList(String[] values) { //Linked List created 
        Node ref = new Node(0);
        Node current = ref;
        for (String value : values) {
            current.next = new Node(Integer.parseInt(value)); //parsing the integer to string
            current = current.next;
        }
        return ref.next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first linked list: ");
        String[] list1Values = sc.nextLine().split(","); //This split function will split the values in linked list with ","
        Node l1 = createLinkedList(list1Values); //l1 linked list created with return type node

        System.out.println("Enter second linked list: ");
        String[] list2Values = sc.nextLine().split(",");
        Node l2 = createLinkedList(list2Values); //l2 linked list created with return type node

        Node oneList = sortLLists(l1, l2); //merged the linked list

        System.out.println("After joining the lists:");
        printLinkedList(oneList);

        sc.close();
    }
}

