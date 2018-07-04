/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class MaxMinForm {
 
    static void rearrange(int arr[])
    {
       int min=0;
       int max=arr.length-1;
       int []temp=arr.clone();
       for(int i=0;i<arr.length;i++)
       {
           if(i%2==0)
           {
               arr[i]=temp[max];
               max--;
           }
           else
           {
               arr[i]=temp[min];
               min++;
           }
       }
    }
    static void printArr(int []arr)
    {
        for(int i=0;i<arr.length;i++)
          System.out.print(arr[i]+" ");
    }
            
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
        int len=sc.nextInt();
        int arr[]=new int[len];
        
        for(int i=0;i<len;i++)
            arr[i]=sc.nextInt();
        
        rearrange(arr);
        printArr(arr);
        System.out.println();
        test--;}
        
    }
}
