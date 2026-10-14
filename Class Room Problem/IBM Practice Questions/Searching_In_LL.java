public class Searching_In_LL {
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

        Node current = a;
        int position = 1;
        int search = 30;
        int count = 0;

        while (current != null) {
            if (current.data == search) {
                count++;
                break;
            }
            current = current.next;
            position++;
        }

        if(count == 1){
            System.out.println("Element Found at Position: " + position);
        }else{
            System.out.println("Element not found");
        }
    }
}
