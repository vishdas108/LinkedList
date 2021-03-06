package org.binaryTree;

import java.util.Stack;

public class BinaryTree {

    public TreeNode root;
    public int size;

    public void insert(int data){

        if(root==null){
            root = new TreeNode(data);
            size= size+1;
            return;
        }

        if(root.insert(data)){
            size=size+1;
        };

    }

   //*****************************************************************************

    public boolean delete(int data){

        System.out.println("First input data and pass it to method with root and data.. helpful for recursion");
            delete(root,data);

        return false;

    }


    private TreeNode delete( TreeNode node, int data){

      /*  if(node ==null){
            return null;
        }*/

        /*
        * LOGIC:
        *
        *
        *
        * */

    if(node.data==data){
        // for leaf Node
        System.out.println("if the current NODE data is equal!!");
        if(node.leftNode==null && node.rightNode==null){
            System.out.println("CASE 1: it's a leafNode");

            System.out.println("If current Node is LeafNode, then return Null. Why?");
            System.out.println("parent NODE is evaluating if left, right Node is equivalent NODE to delete");
            System.out.println("It'll be reassigning the returned NODE ");
            System.out.println("When return null, i.e, currentNode is eligible to delete, so parentNode will reassign the child to null ");

            return null;

        }else if(node.leftNode!=null && node.rightNode==null){
            System.out.println("CASE: Contains one children, it's leftNode exists, Parent is eligible to delete, so the Parent's parent will resign the parent, like promoting the children");
            System.out.println();

            return root.leftNode;



        }else if(node.rightNode!=null && node.leftNode==null){
            System.out.println("CASE: Contains one children, it's leftNode exists, Parent is eligible to delete, so the Parent's parent will resign the parent, like promoting the children");
                return root.rightNode;

        }else if(node.rightNode!=null && node.leftNode!=null){

            TreeNode minNode= getMinimum(node.rightNode);
            minNode.leftNode=node.leftNode;
            return minNode;

        }



    }else if(data<node.data){

         node.leftNode=  delete(node.leftNode,data);

        System.out.println("current Node "+ node.data +" is not equal to data "+data +" : Data is less than node data, hence delegating to it's LEFT-CHILD-NODE, so reassign the left child node and return current node");

    return node;
    }else if(data>node.data){
        System.out.println("current Node "+ node.data +" is not equal to data "+data+ " : Data is greater than node data, hence delegating to it's RIGHT-CHILD-NODE, so reassign the right child node and return current node");
        node.rightNode= delete(node.rightNode,data);
    return node;
    }
        return null;

    }


    public TreeNode getMinimum(){
        return getMinimum(root);
    }


    public TreeNode getMaximum(){

        return getMaximum(root);
    }

    private TreeNode getMaximum(TreeNode node){

        if(node ==null){
            return null;
        }

        if(node.rightNode!=null){
            return getMaximum(node.rightNode);
        }else {

            return node;
        }


    }

    private TreeNode getMinimum(TreeNode node){




        if(node.leftNode!=null){
        return     getMinimum(node.leftNode);
        }


        return node;
    }



   //*****************************************************************************

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

    public void traverseInOrder(){

        traverseInOrder(root);

    }


    public void printInorder(){


        printInOrder(root,new StringBuilder());

    }

    private void printInOrder(TreeNode node, StringBuilder builder){

        if(node==null){
            return;

        }

        builder.append("" +
                "" +
                "" +
                "");

    }

    public int findHeight(){
        return findHeight(root);
    }

    private int findHeight(TreeNode node){

        if (node==null){
            return 0;
        }else{

            int leftHeight = findHeight(node.leftNode);
            int rightHeight = findHeight(node.rightNode);

            if(leftHeight> rightHeight){
                return 1+leftHeight;
            }else {
                return rightHeight +1;
            }



        }



    }



    //*****************************************************************************************************************************

    public Integer [] toArray(){
        // number of nodes  is (2^h)-1
            Integer [] array  = new Integer[(int)Math.pow(2,findHeight())-1];
                array[0]= root.data;
     toArray(root, array,0);

        return array;
    }

    private void toArray(TreeNode root, Integer [] array, int index ){

        if(root==null || index >= array.length){
            return ;
        }

        array[index]= root.data;
        int leftIndex = index*2+1;
        int rightIndex = index*2+2;
        //if(root.leftNode!=null)
            toArray(root.leftNode, array, leftIndex);
       // if(root.rightNode!=null)
            toArray(root.rightNode, array,rightIndex);


        return ;
    }


    public int findSum(){

        return findSum(root);
    }


    public int findSum(TreeNode node){
        if(node== null){
            return 0;
        }


       return node.data+findSum(node.leftNode)+findSum(node.rightNode);

    }
    //*****************************************************************************************************************************



    //*****************************************************************************************************************************

    /*
    *654. Maximum Binary Tree
    * Given an integer array with no duplicates. A maximum tree building on this array is defined as follow:

        1)The root is the maximum number in the array.
        2)The left subtree is the maximum tree constructed from left part subarray divided by the maximum number.
        3)The right subtree is the maximum tree constructed from right part subarray divided by the maximum number.
    *
    *
    * Construct the maximum tree by the given array and output the root node of this tree.
    *
    * Example 1:
Input: [3,2,1,6,0,5]
Output: return the tree root node representing the following tree:

      6
    /   \
   3     5
    \    /
     2  0
       \
        1
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    * */








    //*****************************************************************************************************************************



    //*****************************************************************************************************************************

    /*
    *
    * We are given the head node root of a binary tree, where additionally every node's value is either a 0 or a 1.

Return the same tree where every subtree (of the given tree) not containing a 1 has been removed.

(Recall that the subtree of a node X is X, plus every node that is a descendant of X.)
*
*
    *
    *
    *
    *Example 1:
        Input: [1,null,0,0,1]
        Output: [1,null,0,null,1]

        Explanation:
        Only the red nodes satisfy the property "every subtree not containing a 1".
        The diagram on the right represents the answer.


    *
    *
    *Example 2:
     Input: [1,0,1,0,0,0,1]
        Output: [1,null,1,null,1]



    *
    *
    * */



    //*****************************************************************************************************************************


    /*
    *
    * Input:

     4
   /   \
  2     7
 / \   / \
1   3 6   9
    *
    *
    *
    *
    * Output:

     4
   /   \
  7     2
 / \   / \
9   6 3   1
    *
    *
    *
    *
    *
    * */
    //*****************************************************************************************************************************
    public TreeNode invertTree(TreeNode root) {

        if(root==null){
            return root;
        }

        TreeNode bkp = root.leftNode;


        root.leftNode= root.rightNode;
        root.rightNode = bkp;

        invertTree(root.leftNode);
        invertTree(root.rightNode);



        return root;
    }

    //*****************************************************************************************************************************


    //*****************************************************************************************************************************
    /*
    *
    *
    *
    *
    * compareTwoTrees
    *
    * */

    public boolean isSame(BinaryTree tree){

        return isSame(tree.root, this.root);
    }

    private boolean isSame(TreeNode node1, TreeNode node2){

    if(node1 ==null && node2!=null){
        return false;
    }else if(node1!=null && node2==null){
        return false;
    }else if(node1!=null && node2!=null){
        if(node1.data!=node2.data){
            return false;
        }

        return isSame(node1.leftNode,node2.leftNode) && isSame(node1.rightNode,node2.rightNode);
    }
    return true;
    }



    //*****************************************************************************************************************************
}
