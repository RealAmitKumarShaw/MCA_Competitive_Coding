import java.util.*;

public class Insertion_In_LL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);

        a.next = b;
        b.next = c;

        // Print the current Linked List
        System.out.println("Insertion at Beginning:");
        System.out.print("Before: ");
        Node current = a;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");

        // Insertion at beginning
        Node newElement = new Node(5);
        newElement.next = a;
        a = newElement;

        // Printing Linked List After Intsertion
        System.out.print("After: ");
        current = a;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");

        // Insertion at End
        System.out.println("Insertion at End:");
        System.out.print("Before: ");
        current = a;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");

        Node newElement1 = new Node(50);
        current = a;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newElement1;

        // Printing Linked List After Intsertion
        System.out.print("After: ");
        current = a;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");

        // Insertion at a Specific Position in Linked List
        System.out.println("Insertion at a Specific Position:");
        System.out.print("Before: ");
        current = a;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");

        Node newElement2 = new Node(25);

        System.out.println("Enter the position: ");        
        int position = in.nextInt();

        current = a;
        for(int i = 1; i < position - 1; i++){
            current = current.next;
        }
        newElement2.next = current.next;
        current.next = newElement2;

        // Printing Linked List After Intsertion
        System.out.print("After: ");
        current = a;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
        in.close();
    }
}
