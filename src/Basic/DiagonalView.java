/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

import java.util.HashMap;
import java.util.Vector;

/**
 *
 * @author Litesh
 */
public class DiagonalView {
   static class Node{
    Node left,right;
    int data;
        public Node(int key)
        {
            data=key;
            left=null;
            right=null;
        }
    } 
    
static class BinaryTree {

    Node root;
    HashMap<Integer,Vector<Integer>> map;
    BinaryTree(int key)
    {
        root=new Node(key);
    }
    BinaryTree()
    {
        root =null;
     } 
    
    void  preorder(Node node)
    {
        if(node==null)
            return;
        System.out.print(node.data+" ");
        preorder(node.left);
        preorder(node.right);
    }
    
    void printDiagonalView(Node node,HashMap<Integer,Vector<Integer>> map,int slope)
    {
     
        Vector<Integer> v=map.get(slope);
        if(v==null)
        {
            v=new Vector<Integer>();
            v.add(node.data);
        }
        else
            v.add(node.data);
        
        printDiagonalView(node.left, map, slope+1);
        printDiagonalView(node.right, map, slope);
    }
    
    
}

public static void main(String args[])
{
        BinaryTree tree=new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.preorder(tree.root);
}
}
