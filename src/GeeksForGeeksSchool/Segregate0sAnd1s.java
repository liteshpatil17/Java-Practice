/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeksSchool;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class Segregate0sAnd1s {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
           int arrLen=sc.nextInt(); 
           int arr[]=new int[arrLen];
           
           for(int j=0;j<arrLen;j++)
           {
               arr[j]=sc.nextInt();
           }
          Arrays.sort(arr);
          
          
           for(int j=0;j<arrLen;j++)
           {
               System.out.printf("%d ",arr[j]);
               System.out.print(" ");

           }
           
//           for(int i=0;i<arrLen-1;i++)
//           {
//               System.out.print(arr[i]);
//           }
        test--;}
    }
}
