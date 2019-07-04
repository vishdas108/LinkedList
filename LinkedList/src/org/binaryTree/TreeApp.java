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

        BinaryTree tree2 = new BinaryTree();
        tree2.insert(2);
        tree2.insert(1);
        tree2.insert(3);
        tree2.insert(5);
        tree2.insert(4);
        tree2.insert(6);

        TreeNode treeNode = tree.mergeTwoTrees(tree.root, tree2.root);
        BinaryTree result = new BinaryTree();
        result.root= treeNode;
        tree.traverseInOrder(result);

    }
}
