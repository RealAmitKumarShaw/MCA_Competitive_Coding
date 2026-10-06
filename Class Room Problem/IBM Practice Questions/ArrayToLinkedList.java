public class ArrayToLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 40, 50 };
        Node head = new Node(arr[0]);

        Node current = head;

        for (int i = 0; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }

        current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }
}
