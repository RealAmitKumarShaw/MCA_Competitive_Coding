import org.w3c.dom.Node;

class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Array_LinkedList {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40 };

        node head = null;
        node temp = null;

        for (int i = 0; i < arr.length; i++) {

            node newNode = new node(arr[i]);

            if (head == null) {
                head = newNode;
                temp = newNode;
            } else {
                temp.next = newNode;
                temp = newNode;
            }
        }

        temp = head;

        while (temp != null) {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        }

        System.out.println("null");
    }

}
