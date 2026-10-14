public class Reverse_a_LL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);

        a.next = b;
        b.next = c;
        c.next = d;

        System.out.println("Original Linked List");
        Node current = a;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");

        // Reverse Linked List
        Node previous = null;
        current = a;

        while (current != null) {
            Node nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }
        a = previous;

        // Display Reversed Linked List
        System.out.println("Reversed Linked List");
        current = a;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
