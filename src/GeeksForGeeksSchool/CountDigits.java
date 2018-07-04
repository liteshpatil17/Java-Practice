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
public class CountDigits {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        for(int i=0;i<test;i++)
        {
            int number=sc.nextInt();
            int num=number;
            int count=0,evenDiv,lastDigit;
            while(number>0)
            {
                lastDigit=number%10;
                if((lastDigit!=0)&&(num%lastDigit==0))
                {
                       count++;
                }
                number=number/10;
            }
            System.out.println(count);

        }        
    }
}
