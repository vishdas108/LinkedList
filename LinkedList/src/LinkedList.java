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

            while (traversingNode!=null && traversingNode.nextNode!=null){
                traversingNode= traversingNode.nextNode;
            }

            traversingNode.nextNode = newNode;

    }

    public void insertMiddle(int data){
        LinkedListNode newNode= new LinkedListNode(data);
        LinkedListNode smallPointer=head;
        LinkedListNode bigPointer=head;





        LinkedListNode traverseNode = head;


        while (bigPointer!=null && bigPointer.nextNode!=null && bigPointer.nextNode.nextNode!=null){
            smallPointer= smallPointer.nextNode;
            bigPointer= bigPointer.nextNode.nextNode;

        }
        System.out.println("mid point::  " + smallPointer.data);
        System.out.println("end point::  " + bigPointer.data);

        LinkedListNode tempNode = smallPointer.nextNode;
        smallPointer.nextNode=newNode;
        newNode.nextNode=tempNode;
    }

    public void traverse(){

        LinkedListNode traverseNode = head;

        while (traverseNode!=null){

            System.out.println(traverseNode.data);
            traverseNode = traverseNode.nextNode;
        }
    }




}
