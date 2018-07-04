/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeksSchool;

import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class TransposeOfMatrix {
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
            int size=sc.nextInt();
            int arr[][]=new int[size][size];
            int arr_trans[][]=new int[size][size];

            for(int i=0;i<size;i++)
            {
                for(int j=0;j<size;j++)
                {
                    arr[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<size;i++)
            {
                for(int j=0;j<size;j++)
                {
                    arr_trans[i][j]=arr[j][i];
                }
            }
           
            for(int i=0;i<size;i++)
            {
                for(int j=0;j<size;j++)
                {
                    System.out.print(arr_trans[i][j]+" ");
                }
            }
            
            
        test--;}
    
    }
    
}
