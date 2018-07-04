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
public class SumsOfItheRowAndiThColumn {
     public static void main(String args[])
    {
               Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
            int m=sc.nextInt();
            int n=sc.nextInt();
            int flag=0;
            int mat[][]=new int[m][n];
            int row[]=new int[m];
            int col[]=new int[n];

            for(int i=0;i<=m-1;i++)
            { 
                for(int j=0;j<=n-1;j++)
                {
                    mat[i][j]=sc.nextInt();
                    row[i]=row[i]+mat[i][j];   
                }
            }
            
            
            for(int i=0;i<=n-1;i++)
                for(int j=0;j<=m-1;j++)
                   col[i]=col[i]+mat[j][i];

            
            
           
            
            for(int i=0,j=0;i<=m-1 & j<=n-1;i++,j++)
            {
             if(row[i]==col[j])
                {
                    flag++;
                }
            }
            
//            System.out.println(Arrays.toString(row));   
//            System.out.println(Arrays.toString(col));
            
            if(flag!=0)
                System.out.println("Yes");
            else
                System.out.println("No") ;
            
            test--;}
            
        }
            
        }
    
