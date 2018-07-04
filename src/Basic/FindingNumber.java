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
public class FindingNumber {
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {  
            int n=sc.nextInt();
            int x=sc.nextInt();
            int []arr=new  int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
                int index=Arrays.binarySearch(arr, x);
            
            
                  if(index<0)
                      System.out.println("OOPS! NOT FOUND");
                  else 
                      System.out.println(index);
            
        test--;}
    }
}
