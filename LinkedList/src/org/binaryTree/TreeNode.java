package org.binaryTree;

import sun.reflect.generics.tree.Tree;

public class TreeNode {

    public Integer data;
    public TreeNode leftNode;
    public TreeNode rightNode;

public TreeNode(int data){
    this.data= data;
}

public void insert(int data){

    if(data<this.data){

        if(this.leftNode==null){
            this.leftNode= new TreeNode(data);

        }else {
            this.leftNode.insert(data);
        }




    }else if(data>this.data){

        if(this.rightNode== null){
            this.rightNode = new TreeNode(data);
        }else{
            this.rightNode.insert(data);
        }

    }

}



}
