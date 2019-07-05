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


        BinaryTree tree2 = new BinaryTree();
        tree2.insert(2);
        tree2.insert(1);
        tree2.insert(3);

        Integer[] ints = tree.toArray();
        System.out.println(Arrays.toString(ints));
        System.out.println(tree.findSum());
        //  tree2.insert(5);
       // tree2.insert(4);
       // tree2.insert(6);

     //   System.out.println(tree2.size);
      //  TreeNode treeNode = tree.mergeTwoTrees(tree.root, tree2.root);


    }
}
