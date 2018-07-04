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
public class SegregateEvenAndOddNumbers {

    public static void SegregateEvenAndOddNumbers(int[] arr,int n)
    {
        int[] tempEven=arr.clone();
        int[] tempOdd=arr.clone();
        int even=0,odd=0;
        for(int i=0;i<n;i++)
        {
         if(arr[i]%2==0)
         {
             tempEven[even]=arr[i];
             even++;
         }
         if(arr[i]%2!=0)
         {
           tempOdd[odd]=arr[i];
                odd++;
         }
        }
        
        Arrays.sort(tempEven,0,even);
        Arrays.sort(tempOdd,0,odd);
        
        for(int i=0;i<even;i++)
         System.out.print(tempEven[i]+" ");
        
        for(int i=0;i<odd;i++)
         System.out.print(tempOdd[i]+" ");
        
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
        SegregateEvenAndOddNumbers(arr,arr.length);
        System.out.println();
        test--;}
}
}
