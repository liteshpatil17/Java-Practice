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
public class FrontBackTransformation {
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        for(int t=0;t<test;t++)
        {
            String str=sc.next();
            String TransSt="";
            char strArr[]=str.toCharArray();
            char AZ[]=new char[26];
            char az[]=new char[26];
            char ZA[]=new char[26];
            char za[]=new char[26];
            int k=0;
            for(int i=65,j=97;i<=90&j<=122;i++,j++)
            {
                AZ[k]=(char) i;
                az[k]=(char) j;
                k++;
            }
            k=0;
            for(int i=90,j=122;i>=65&j>=97;i--,j--)
            {
                ZA[k]=(char) i;
                za[k]=(char) j;
                k++;
            }
            
            for(int i=0;i<strArr.length;i++)
            {
                char c=strArr[i];
                if(Character.isLowerCase(c))
                    {
                        int index=Arrays.binarySearch(az, c);
                        TransSt+=za[index];
                    }
                else if((Character.isUpperCase(c)))
                    {
                        int index=Arrays.binarySearch(AZ, c);
                        TransSt+=ZA[index];
                    }
            }
            
            System.out.println(TransSt);
//            for(int i=0;i<26;i++)
//            {
//                System.out.print(ZA[i]+" ");
//            }
                
        }
    }
}
