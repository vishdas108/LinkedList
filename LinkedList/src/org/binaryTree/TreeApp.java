package org.binaryTree;

import java.util.Arrays;

public class TreeApp {

    public static void main(String[] args) {


        BinaryTree tree = new BinaryTree();
        tree.insert(2);
        tree.insert(1);
        tree.insert(3);
        tree.insert(5);
        tree.insert(4);
        tree.insert(6);
        tree.insert(-1);


        BinaryTree tree2 = new BinaryTree();
        tree2.insert(2);
        tree2.insert(1);
        tree2.insert(3);

        Integer[] ints = tree.toArray();
       // System.out.println(Arrays.toString(ints));
       // System.out.println(((TreeNode)tree.getMinimum()).data);

        BinaryTree deleteData = new BinaryTree();

        deleteData.insert(50);
        deleteData.insert(30);
        deleteData.insert(70);
        deleteData.insert(20);
        deleteData.insert(40);
        deleteData.insert(60);
        deleteData.insert(80);


        deleteData.delete(30);
        System.out.println("");
     //   System.out.println(((TreeNode)deleteData.getMaximum()).data);
        deleteData.traverseInOrder();

        System.out.println(tree2.isSame(tree));

       // System.out.println(tree2.getMinimum());
        //  tree2.insert(5);
       // tree2.insert(4);
       // tree2.insert(6);

     //   System.out.println(tree2.size);
      //  TreeNode treeNode = tree.mergeTwoTrees(tree.root, tree2.root);


    }
}
