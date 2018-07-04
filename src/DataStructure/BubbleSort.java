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
public class BubbleSort {
 
 void sort(int arr[])
 {
     for(int i=0;i<arr.length;i++)
         for(int j=0;j<arr.length-1-i;j++)
         {
             if(arr[j+1]<arr[j])
             {
                 int temp=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
             }
     }
 }
 
 void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
 
 public static void main(String args[])
 {  
     BubbleSort ob=new BubbleSort();
     int arr[] = {64, 34, 25, 12, 22, 11, 90};
     ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
 }
}
