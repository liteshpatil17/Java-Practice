/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeksSchool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class TidyNumber {
     public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int test;
        test=scan.nextInt();
        while(test>0)
        {
         int num=scan.nextInt(),flag=-1;
         String numStr=String.valueOf(num);
         int arr[]=new int[numStr.length()];
         int []CopyofNumArr=new int[numStr.length()];
         int i=numStr.length()-1;
         while(num!=0)
         {
             arr[i]=num%10;
             CopyofNumArr[i]=arr[i];
             num/=10;
                 // System.out.println(arr[i]);
             i--;
         }
         
         Arrays.sort(CopyofNumArr);
       //  System.out.print(Arrays.toString(CopyofNumArr));
        // System.out.print(Arrays.toString(arr));
         for(int k=0;k<arr.length;k++)
         {
            if(CopyofNumArr[k]==arr[k])
                continue;
            else
            {
                flag=0;
                break;
            }
            
         }
         if(flag==0)
            System.out.println(0);
         else
            System.out.println(1);

        }
    }
}
