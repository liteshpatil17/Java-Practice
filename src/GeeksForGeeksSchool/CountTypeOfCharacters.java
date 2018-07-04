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
public class CountTypeOfCharacters {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int test=sc.nextInt();
       for(int t=1;t<=test;t++)
       {
         String str=sc.next();
         char arr[]=str.toCharArray();
         int upper_count=0,lower_count=0,num_count=0,special_count=0;
         for(int j=0;j<arr.length;j++)
         {
             if(Character.isUpperCase(arr[j]))
                 upper_count++;
             else if(Character.isLowerCase(arr[j]))
                 lower_count++;
             else if(Character.isDigit(arr[j]))
                 num_count++;
             else
                 special_count++;
         }
         System.out.print(upper_count+"\n"+lower_count+"\n"+num_count+"\n");
         System.out.println(special_count);

       }
    }
    
}
