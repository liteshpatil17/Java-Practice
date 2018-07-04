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
public class ExponentialSearch {
    
    static int exponentialSearch(int arr[],int x)
    {
        if(arr[0]==x)
            return 0;
        int i=1;
        while(i<arr.length && arr[i]<x)
            i*=2;
        return Arrays.binarySearch(arr, i/2, Math.min(i,arr.length), x);
    }
    
  public static void main(String args[])
    {
        int arr[] = {2, 3, 4, 10, 40};
        int x = 10;
        int result = exponentialSearch(arr,x);
         
        System.out.println((result < 0) ? "Element is not present in array" :
                                   "Element is present at index " + result);
    }
}