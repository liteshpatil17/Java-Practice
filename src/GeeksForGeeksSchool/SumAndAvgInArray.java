/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeksSchool;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class SumAndAvgInArray {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int test=sc.nextInt();
    for(int i=0;i<test;i++)
        {
            int sum=0,arrLen=sc.nextInt();
            double avg;
            int arr[]=new int[arrLen];
            for(int j=0;j<arrLen;j++)
                {
                 arr[j]=sc.nextInt();
                 sum=sum+arr[j];
                }
            avg=sum/(double)arrLen;
        System.out.print((int)sum+" ");
        System.out.printf("%.2f\n",avg);
        }
    }
    
}
