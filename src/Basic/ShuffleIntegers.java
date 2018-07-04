/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class ShuffleIntegers {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       
        int test=sc.nextInt();
while(test>0){
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        if(n%2==0)
        {for(int i=0,j=n/2;i<n/2 && j<n;i++,j++)
            System.out.print(arr[i]+" "+arr[j]+" ");
            }    
        else
        {for(int i=0,j=(n-1)/2;i<(n-1)/2 && j<n-1;i++,j++)
           System.out.print(arr[i]+" "+arr[j]+" ");
         System.out.print(arr[n-1]);
        }
        System.out.println();
        
    test--;}
}
}
