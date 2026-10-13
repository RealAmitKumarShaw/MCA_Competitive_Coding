import java.util.*;

public class Deletion_In_LL {
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
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        // Head points to first node
        Node head = a;

        // Print before deletion
        System.out.print("Before Deletion: ");
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");

        // Deletion at Beginning
        head = head.next;
        System.out.print("After Deletion: ");
        current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");

        // Deletion at End
        System.out.print("Before Deletion: ");
        current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");

        System.out.print("After Deletion: ");

        if (head == null) {
            System.out.println("Linked List is empty");
        } else if (head.next == null) {
            head = null;
        } else {
            current = head;

            while (current.next.next != null) {
                current = current.next;
            }

            current.next = null;
        }

        current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");

        // Deletion at Specific Position
        System.out.print("Enter the Position: ");
        int position = in.nextInt();

        if (head == null) {
            System.out.println("Linked List is empty");
        } else if (position == 1) {
            head = head.next;
        } else {
            current = head;

            for (int i = 1; i < position - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        System.out.print("After Deletion: ");
        current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");

        in.close();
    }
}
