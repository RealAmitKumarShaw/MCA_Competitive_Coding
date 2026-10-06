public class basicll {
    public static class Node {
        int data; // Value
        Node next; // Address of next node

        Node(int data){
            this.data = data;
            // this.next = 
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        System.out.println(a.next);
        Node b = new Node(10);
        Node c = new Node(15);
        Node d = new Node(16);
        // 5 -> 10 -> 15 -> 16 -> null
        a.next = b;
        b.next = c;
        c.next = d;
        System.out.println(a.next);
        System.out.println(b);
        System.out.println(c);
    }
}
