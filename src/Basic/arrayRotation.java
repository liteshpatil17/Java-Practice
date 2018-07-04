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
public class arrayRotation {
    
   static void Rotate(int arr[],int s,int d)
    {
        
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);
    }
    
   static void reverse(int[]arr ,int s,int d)
   {
         while(d>s)
         {
          int temp=arr[s];   
          arr[s]=arr[d];
          arr[d]=temp;
          s++;
          d--;
         }
   }
    public static void print(int arr[])
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
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            int d=sc.nextInt();
            Rotate(arr,0,d);
            print(arr);
            System.out.println();

        test--;}
    }
}
