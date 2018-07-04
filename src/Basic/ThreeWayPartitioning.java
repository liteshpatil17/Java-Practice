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
public class ThreeWayPartitioning {
     public static  int [] ThreeWay(int []arr,int min ,int max)
    {
        int end=arr.length-1;
        int start=0;
        for(int i=start;i<=end;)
        {
            if(arr[i]<min)
            {
                int temp=arr[start];
                arr[start]=arr[i];
                arr[i]=temp;
                start++;
                i++;
            }
            else if(arr[i]>max)
            {
                int temp=arr[end];
                arr[end]=arr[i];
                arr[i]=temp;
                end--;
                i++;
            }
            else 
                i++;
        }
        return arr;
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        { 
            int len=sc.nextInt();
            int min=sc.nextInt();
            int max=sc.nextInt();
            
            int arr[]=new int[len];
            for(int i=0;i<len;i++)
                arr[i]=sc.nextInt();
            
           //int arr[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};
           //int min=14,max=20;
           arr= ThreeWay(arr,min,max);
           
           for(int i=0;i<arr.length;i++) 
               System.out.print(arr[i]+" ");
         test--;}
    }
}
