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
public class BinarySearch {
   int search(int arr[],int l,int r,int x)
   {
       if(r>=l)
       {
       int mid=(l+r)/2;
       
       if(arr[mid]==x)
           return mid;
       else if(arr[mid]<x)
           return search(arr,mid+1,r,x);
       else if(arr[mid]>x)
           return search(arr,l,mid-1,x);
        }
           return -1;
   }
       
   public static void main(String args[])
   {
       BinarySearch bs=new BinarySearch();
       int arr[]={2,3,4,10,40};
       Arrays.sort(arr);
       int result=bs.search(arr,0,arr.length-1,10);
         if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "+result);
   }
}
