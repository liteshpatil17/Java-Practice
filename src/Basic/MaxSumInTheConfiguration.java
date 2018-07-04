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
public class MaxSumInTheConfiguration {
     
    static int max_sum(int A[],int N)
    {
        int MaxSum=0;
        int currentSum=0;
        for(int i=0;i<A.length;i++)
        {
            rotate(A);
            for(int j=0;j<A.length;j++)
                currentSum=currentSum+A[j]*(j);
            if(currentSum>MaxSum)
                MaxSum=currentSum;
             currentSum=0;
        }
        return MaxSum;
    }
    
    static void rotate(int A[])
    {
        int temp=A[0];
        for(int i=0;i+1<A.length;i++)
            A[i]=A[i+1];
        A[A.length-1]=temp;
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
                
            int max_sum=max_sum(arr, len-1);
            System.out.println(max_sum);
        test--;}
   }
}
