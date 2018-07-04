/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

/**
 *
 * @author Litesh
 */

  class Node
    {
        Node left,right;
        char data;
        Node(char data){
        left=null;
        right=null;
        this.data=data;
        }
    }

        
public class TreeFromInAndPre {

    Node root;
    public static int preIndex=0;
    
        Node buildTree(char in[],char pre[],int startInd,int endIndex)
        {
         if(startInd>endIndex)
             return null;
         
         Node tnode=new Node(pre[preIndex++]);
         
         int Index=searchIn(in,startInd,endIndex,tnode.data);
         
         tnode.left=buildTree(in,pre,startInd,Index-1);
         tnode.right=buildTree(in,pre,Index+1,endIndex);
        return tnode;
        }
        
        static int searchIn(char[] in,int startInd,int endIndex,char data)
        {
            int i;
            for(i=startInd;startInd<=endIndex;i++)
            {
                if(in[i]==data)
                    return i;
            }
            return i;
        }
        
     void printInorder(Node node) 
    {
        if (node == null)
            return;
        printInorder(node.left);
        System.out.print(node.data+" ");
        printInorder(node.right);
        
    }
    public static void main(String args[])
    {
        TreeFromInAndPre tree=new TreeFromInAndPre();
        char in[]=new char[]{'D','B','E','A','F','C'};
        char pre[]=new char[]{'A','B','D','E','C','F'};
        int len=in.length;
        tree.root=tree.buildTree(in,pre,0,len-1);
         System.out.println("Inorder traversal of constructed tree is : ");
        tree.printInorder(tree.root);
    }
}
