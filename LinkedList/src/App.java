public class App {


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insertEnd(1);
        ll.insertEnd(10);
        ll.insertEnd(10);
        ll.insertEnd(2);
        ll.insertEnd(3);
        ll.insertEnd(4);
        ll.insertEnd(5);
        ll.insertEnd(6);
        ll.insertEnd(7);
        ll.insertEnd(8);
        ll.insertEnd(9);
        ll.insertEnd(10);
        ll.insertEnd(10);
        ll.insertEnd(10);
        ll.insertEnd(10);
        ll.insertEnd(11);

        ll.deleteAll(10);


        ll.traverse();
    }
}
