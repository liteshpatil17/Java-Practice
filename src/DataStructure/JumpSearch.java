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
// Java program to implement Jump Search.
public class JumpSearch
{
    public static int jumpSearch(int[] arr, int x)
    {
        int len =arr.length;
       int step=(int)Math.floor(Math.sqrt(len));
       int prev=0;
       
       while(arr[Math.min(step, len)-1]<x)
       {
           prev=step;
           step+=(int)Math.floor(Math.sqrt(len));
           if(prev>len)
               return -1;
       }
       while(arr[prev]<x)
       {
           prev++;
           if(prev==Math.min(step,len))
               return -1;
       }
       if(arr[prev]==x)
           return prev;
       return -1;
    }
 
    // Driver program to test function
    public static void main(String [ ] args)
    {
        int arr[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21,
                     34, 55, 89, 144, 233, 377, 610};
        int x = 55;
 
        // Find the index of 'x' using Jump Search
        int index = jumpSearch(arr, x);
 
        // Print the index where 'x' is located
        System.out.println("\nNumber " + x +
                            " is at index " + index);
    }
}