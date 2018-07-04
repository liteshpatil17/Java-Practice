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
public class BitonicSubarray {
    static void BitonicSubarray(int []arr,int n)
    {
        int[] inc = new int[n];                                
        int[] dec = new int[n]; 
        int max;
 
        inc[0] = 1;
         dec[n-1] = 1;
 
        
        for (int i = 1; i < n; i++)
           inc[i] = (arr[i] >= arr[i-1])? inc[i-1] + 1: 1;
        for (int i = n-2; i >= 0; i--)
            dec[i] = (arr[i] >= arr[i+1])? dec[i+1] + 1: 1;
        max = inc[0] + dec[0] - 1;
        for (int i = 1; i < n; i++)
            if (inc[i] + dec[i] - 1 > max)
                max = inc[i] + dec[i] - 1;
 
            System.out.println(max);
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
        
        BitonicSubarray(arr,arr.length);
        test--;}
    }
}
