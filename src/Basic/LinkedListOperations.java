/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

/**
 *
 * @author Litesh
 */
public class LinkedListOperations {
static  class LinkedList
{  
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
 
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
 
    public void insertAfter(Node prev_node, int new_data)
    {
        if (prev_node == null)
        {
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }
    
    public void append(int new_data)
    {
        Node new_node = new Node(new_data);
        if (head == null)
        {
            head = new Node(new_data);
            return;
        }
        new_node.next = null;
        Node last = head; 
        while (last.next != null)
            last = last.next;
        last.next = new_node;
        return;
    }

    public void printList(Node tnode)
    {
        if(tnode==null)
            return;
            System.out.print(tnode.data+" ");
            printList(tnode.next);
    }
 
  public static void main(String[] args)
    {
        LinkedList llist = new LinkedList();
        llist.append(6);
        llist.push(7);
        llist.push(1);
        llist.append(4);
        llist.insertAfter(llist.head.next, 8);
        llist.printList(llist.head);
    }
}
}
