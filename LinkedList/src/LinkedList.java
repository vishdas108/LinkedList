public class LinkedList {

    public LinkedListNode head;



    public void insertStart(int data){
        LinkedListNode newNode = new LinkedListNode(data);

        if(head==null){
            head= newNode;
        return;
        }

        newNode.nextNode= head;

    }

    public void insertEnd(int data){

        LinkedListNode newNode = new LinkedListNode(data);

        if(head==null){
            head = newNode;
            return;
        }

        LinkedListNode traversingNode = head;

            while (traversingNode!=null){
                traversingNode= traversingNode.nextNode;
            }

            traversingNode.nextNode = newNode;

    }

}
