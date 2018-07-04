/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.*;

/**
 *
 * @author Litesh
 */
public class BinaryMinHeap<T> {
    private List<Node> allNodes=new ArrayList<Node>();
    private Map<T,Integer> nodePosition=new HashMap<>();

    public boolean containsData(T key)
    {
        return allNodes.contain(key);
    }
    private void add(int weight, T key) {
        Node node=new Node();
        node.weight=weight;
        node.key=key;
        allNodes.add(node);
        int size=allNodes.size();
        int current=size-1;
        int parent=(size-1)/2;
        while(parent>=0)
        {
            Node parentNode=allNodes.get(parent);
            Node currentNode=allNodes.get(current);
            if(parentNode.weight > currentNode.weight)
            {
                swap(parentNode,currentNode);
                UpdatePositionMap(parentNode.key,currentNode.key,parent,current);
                current=parent;
                parent=(parent-1)/2;
            }else
                break;
        }
    }

    public void decrease(T data,int newWeight)
    {
        Integer pos=nodePosition.get(data);
        allNodes.get(pos).weight=newWeight;
        int parent=(pos-1)/2;
        int current=pos;
        while(parent>=0)
        {
            Node parentNode=allNodes.get(parent);
            Node currentNode=allNodes.get(current);
            if(parentNode.weight > currentNode.weight)
            {
                swap(parentNode,currentNode);
                UpdatePositionMap(parentNode.key,currentNode.key,parent,current);
                current=parent;
                parent=(parent-1)/2;
            }else
                break;
        }
    }
    
    
    public Node extractMinNode()
    {
        int size=allNodes.size()-1;
        Node minNode=new Node();
        minNode.key=allNodes.get(0).key;
        minNode.weight=allNodes.get(0).weight;
        
        int lastNodeWeight=allNodes.get(size).weight;
        allNodes.get(0).weight=lastNodeWeight;
        allNodes.get(0).key=allNodes.get(size).key;
        nodePosition.remove(minNode.key);
        nodePosition.remove(allNodes.get(0));
        nodePosition.put(allNodes.get(0).key,0);
        allNodes.remove(size);
        int current=0;
        size--;
        while(true)
        {
            int left=(current*2)+1;
            int right=(current*2)+2;
            if(left>size)
                   break;
            if(right>size)
                right=left;
             int smallerIndex= (allNodes.get(left).weight < allNodes.get(right).weight)? left : right;
             if(allNodes.get(smallerIndex).weight < allNodes.get(current).weight)
             {
                 swap(allNodes.get(smallerIndex),allNodes.get(current));
                 UpdatePositionMap(allNodes.get(smallerIndex).key, allNodes.get(current).key, smallerIndex, current);
                 current=smallerIndex;
             }
        }
        return minNode;
    }
    
    public T extractMin(){
        Node node = extractMinNode();
        return node.key;
    }

    private void printPositionMap(){
        System.out.println(nodePosition);
    }
    public Integer getWeight(T key)
    {
        Integer pos=nodePosition.get(key);
        return allNodes.get(pos).weight;
    }
    
    public T min()
    {
        return allNodes.get(0).key;
    }
    
    public boolean empty()
    {
        return allNodes.size()==0;
    }
    
    
    
    private void swap(Node parentNode, Node currentNode) {
        T key=parentNode.key;
        int weight=parentNode.weight;
        parentNode.key=currentNode.key;
        parentNode.weight=currentNode.weight;
        currentNode.key=key;
        currentNode.weight=weight;        
    }

    private void UpdatePositionMap(T a, T b, int parent, int current) {
       nodePosition.remove(a);
       nodePosition.remove(b);
       nodePosition.put(a,parent);
       nodePosition.put(b,current);
    }
    
    class Node
    {
        T key;
        int weight;
    }
     public void printHeap(){
        for(Node n : allNodes){
            System.out.println(n.weight + " " + n.key);
        }
    }
    public static void main(String args[])
    {
        BinaryMinHeap<String> heap=new BinaryMinHeap<String>();
        heap.add(3, "Tushar");
        heap.add(4, "Ani");
        heap.add(8, "Vijay");
        heap.add(10, "Pramila");
        heap.add(5, "Roy");
        heap.add(6, "NTF");
        heap.add(2,"AFR");
        heap.decrease("Pramila", 1); 
        heap.printHeap();
        System.out.println("Min "+heap.extractMin());
        heap.printPositionMap();
    }
    
}
