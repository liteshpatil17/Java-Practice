/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

import java.util.Arrays;

/**
 *
 * @author Litesh
 */
public class InsertionSort {

    
void sort(int arr[])
 {
     for(int i=1;i<arr.length;i++)
     {
          int key=arr[i];
          int j=i-1;
          
          while(j>=0 && arr[j]>key)
          {
           arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
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
     InsertionSort ob=new InsertionSort();
     int arr[] = {64, 34, 25, 12, 22, 11, 90};
     ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
 }
}
