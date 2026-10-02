class node{
    int data;
    node next;
}
public class LinkedList_Create {
    public static void main(String[] args) {
        node n1 = new node();
        node n2 = new node();
        node n3 = new node();

        n1.data = 10;
        n2.data = 20;
        n3.data = 30;

        n1.next = n2;
        n2.next = n3;

        System.out.println(n1.data);
        System.out.println(n2.data);
        System.out.println(n3.data);

    }
}
