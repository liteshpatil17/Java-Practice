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
public class SumOfDiagonals {
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
           int n=sc.nextInt();
           int arr[][]=new int[n][n];
           int sumPrim=0,sumSec=0;
           for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                arr[i][j]=sc.nextInt();
                
           for(int i=0;i<n;i++)
                sumPrim=sumPrim+arr[i][i];
           
           for(int i=0;i<n;i++)
               sumSec=sumSec+arr[i][(n-1)-i];
           
           System.out.println(sumPrim+" "+sumSec);
        test--;}
    }
}
