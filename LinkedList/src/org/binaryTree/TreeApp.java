package org.binaryTree;

public class TreeApp {

    public static void main(String[] args) {


        BinaryTree tree = new BinaryTree();
        tree.insert(2);
        tree.insert(1);
        tree.insert(3);
        tree.insert(5);
        tree.insert(4);
        tree.insert(6);
        tree.traverseInorder();

    }
}
