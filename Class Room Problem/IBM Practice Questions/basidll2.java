public class basidll2 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(10);
        Node d = new Node(3);

        a.next = b;
        b.next = c;
        c.next = d;

        // Display using While loop
        System.out.println("Display Using while Loop");
        Node current = a;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");

        // Display using for loop
        System.out.println("Display using for loop");
        for(current = a; current != null; current = current.next){
            System.out.print(current.data + " -> ");
        }
        System.out.println("null");
    }
}
