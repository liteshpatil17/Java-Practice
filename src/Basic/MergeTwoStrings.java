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
public class MergeTwoStrings {
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        { 
            String str1=sc.next();
            String str2=sc.next();
            StringBuilder sb1=new StringBuilder(str1);
            StringBuilder sb2=new StringBuilder(str2);
            
            int n=str1.length();
            int m=str2.length();
           
            for(int i=0;i<Math.min(n, m);i++)
            { 
                    System.out.print(sb1.charAt(i)+""+sb2.charAt(i));
            }
            
            
            for(int j=Math.min(n, m);j<Math.max(n, m);j++)
            { 
                if(Math.max(n,m)==n)    
                    System.out.print(sb1.charAt(j));
                else
                    System.out.print(sb2.charAt(j));

            }
            
            System.out.println();
        test--;}
    }
}
