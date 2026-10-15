public class Middle_of_a_LL {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        // Node e = new Node(50);

        a.next = b;
        b.next = c;
        c.next = d;
        // d.next = e;

        int count = 0;
        Node current = a;

        while(current != null){
            count++;
            current = current.next;
        }

        int middle = count / 2;

        current = a;

        for(int i = 1; i <= middle; i++){
            current = current.next;
        }
        System.out.println("Middle element Of the linked list: " + current.data);
    }
}
