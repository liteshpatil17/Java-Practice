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
public class SmalllestAndSeccondSmall 
{
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int test=sc.nextInt();
    
    
    for(int i=0;i<test;i++)
    {
     int arrLen=sc.nextInt();
     int arr[]=new int[arrLen],check=-1;
     for(int j=0;j<arrLen;j++)
     {
         arr[j]=sc.nextInt();
     }
      Arrays.sort(arr);
    int min=arr[0],secondMin;
    for(int j=0;j<arrLen-1;j++)
        {
            if(min<arr[j])
            {
                check=0;
                secondMin=arr[j];
                System.out.println(min+" "+secondMin);
                break;
            }
        }
      if(check==-1)
          System.out.println(-1);

    }
}
}
