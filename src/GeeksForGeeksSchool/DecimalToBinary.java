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
public class DecimalToBinary {
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       int test=sc.nextInt();
       for(int t=1;t<=test;t++)
        {
            int Decimal=sc.nextInt();
            String Binary=Integer.toBinaryString(Decimal);
            System.out.println(Binary);
        }
       
   }
}
