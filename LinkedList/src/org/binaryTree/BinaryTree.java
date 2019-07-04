package org.binaryTree;

public class BinaryTree {

    private TreeNode root;


    public void insert(int data){

        if(root==null){
            root = new TreeNode(data);
        }

        root.insert(data);

    }

    // problem one printTree
    public void traverseInorder(){

        if(root==null){
            return;
        }
        traverseInOrder(root);

    }

    /*
        EveryNode is a root,
        you need to print the leftMost node first
        print only if the leftNode is absent i.e, smallest. which is also a root.
        look for the right node, which will be immediate greater that the printed Node

        It's very simple, you have a root with or without children
        you need to print the smallest, usually leftNode is smaller,
        so if there exists a leftNode, then simply delegete to print that node
        this node also checks, if there is any smallerNode by checking leftNode exists or not.
        if not print the currentNode

        once the smallNode is printed, anything above is bigger than rightNode, if rightNode exist,
        give control to that rightNode to print, now this rightNode will be root, so follow same principle
        printing anyNode, check is smaller exists before printing. 



    *
    * */
    private void traverseInOrder(TreeNode root){

        if(root.leftNode!=null){
            traverseInOrder(root.leftNode);
        }

        System.out.println(root.data);

        if(root.rightNode!=null){
            traverseInOrder(root.rightNode);
        }

    }
}
