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
public class LeftRotateMatrixKTimes {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
        int m,n,k;
        n=sc.nextInt();
        m=sc.nextInt();
        k=sc.nextInt();
        int mat[][]=new int[n][m];
        
        for(int i=0;i<=n-1;i++)
        {
            for(int j=0;j<=m-1;j++)
                mat[i][j]=sc.nextInt();
        }
        
//       for(int i=0;i<=n-1;i++)
//        {
//            for(int j=0;j<=m-1;j++)
//                System.out.print(mat[i][j]+" ");
//            System.out.println("");
//        }
       
        while(k>0)
        {
           for(int i=0;i<=n-1;i++)
            { 
                int key=mat[i][0];            
//                System.out.println("key ="+key);

                for(int j=0;j<=m-1;j++)
                {  
                    
                    if(j+1<=m-1)
                    {
                        mat[i][j]=mat[i][j+1];
                    }else
                        mat[i][j]=key;
                }
            }
        k--;}
        
                    System.out.println("");

                    
        for(int i=0;i<=n-1;i++)
        {
            for(int j=0;j<=m-1;j++)
                System.out.print(mat[i][j]+" ");
//            System.out.println("");
        }


    test--;}
    }
}

//3
//3
//1
//1
//2
//3
//1
//2
//3
//1
//2
//3