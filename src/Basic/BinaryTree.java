/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Litesh
 */

class Node{
    Node left,right;
    int data;
        public Node(int key)
        {
            data=key;
            left=null;
            right=null;
        }
    } 
    
public class BinaryTree {

    Node root;
    BinaryTree(int key)
    {
        root=new Node(key);
    }
    BinaryTree()
    {
        root =null;
     }
    
    void inorder()
    {
          if (root == null) {
            return;
        }
        Stack<Node> st=new Stack<Node>();
         Node node = root;
        st.push(node);
        
        while(node!=null)
        {
            st.push(node);
            node=node.left;
        }
        
        while(st.size()>0)
        {
            node=st.pop();
            System.out.print(node.data+" ");
            
            if(node.right!=null)
            {  node=node.right;
                while(node!=null)
                {
                    st.push(node);
                    node=node.left;
                }
            }
        }
        
    }

//    void printLevelOrder()
//    {
//        Queue <Node> q=new LinkedList<Node>();
//        q.add(root);
//        while(q.isEmpty()==false)
//        {
//            Node temp=q.poll();
//            System.out.println(temp.data);
//            
//            if(temp.left!=null)
//                q.add(temp.left);
//            if(temp.left!=null)
//                q.add(temp.right);
//        }
//    }
   
//    int height(Node root)
//    {
//        if(root==null)
//            return 0;
//        else
//        {
//            int lheight=height(root.left);
//            int rheight=height(root.right);
//            
//            if(lheight>rheight)
//                return lheight+1;
//            else
//                return rheight+1;
//
//        }
//    }
//    
//    void printLevelOrder()
//    {
//        int level=height(root);
//
//        for(int i=1;i<=level;i++)
//        {
//            printLevel(root,i);
//            System.out.println();
//        }
//    }
//    
//    void printLevel(Node root,int level)
//    {
//        if(root==null)
//           return ;
//        if(level==1)
//            System.out.print(root.data+" ");
//        else if(level>1)
//        {
//            printLevel(root.left,level-1);
//            printLevel(root.right,level-1);
//            
//        }
//    }

    
public static void main(String args[])
    {
        BinaryTree tree=new BinaryTree();
     tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        
        tree.inorder();

     
        
    }
}
