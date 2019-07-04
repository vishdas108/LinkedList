package org.binaryTree;

import java.util.Stack;

public class BinaryTree {

    public TreeNode root;


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


/*
*
*
*
* TODO
*
*
*
* */
    public void traverseInOrderIteratively(TreeNode rootNode){

        Stack<TreeNode> stk = new Stack<>();

        TreeNode traversalNode = rootNode;

            stk.push(traversalNode);

            while(!stk.isEmpty()){

                if(stk.peek().rightNode!=null){
                    stk.push(stk.peek().rightNode);
                }

            }






    }

/*
*Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not.
* You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.
* Input:
	Tree 1                     Tree 2
          1                         2
         / \                       / \
        3   2                     1   3
       /                           \   \
      5                             4   7
Output:
Merged tree:
	     3
	    / \
	   4   5
	  / \   \
	 5   4   7
*
*
*
*
*
* SOLN
*
* Consider we are merging leftNode of a Tree.
* consider we are merging t2 into t1
*
* if both nodes exists then we we add the values into t1 and return t1.
* else we should return present node, null can't be added ryt!!
*      This is happening for eachNode
*       Operation Node, takeCare of left and right Node as well.
* */
    public TreeNode  mergeTwoTrees(TreeNode t1, TreeNode t2){

        if(t1==null && null  == t2){
            return t1;
        }


        if(t1==null){
            return t2;
        }
        if(t2==null){
            return t1;

        }
        t1.leftNode = mergeTwoTrees(t1.leftNode,t2.leftNode);
        t1.rightNode = mergeTwoTrees(t1.rightNode,t2.rightNode);

        t1.data = t1.data+t2.data;



        return t1;
    }

    public void traverseInOrder(BinaryTree tree){

        traverseInOrder(tree.root);

    }

    public void printInorder(){



    }
}
