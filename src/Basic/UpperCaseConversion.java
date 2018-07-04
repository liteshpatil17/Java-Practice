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
public class UpperCaseConversion {
 public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {   
         String str=sc.next();
         str += sc.nextLine();
         String[] splitStr=str.split("\\s+");
         for(int i=0;i<splitStr.length;i++)
         {
             Character.toUpperCase(splitStr[i].charAt(0));
             System.out.print(Character.toUpperCase(splitStr[i].charAt(0)));
             for(int j=1;j<splitStr[i].length();j++)
              System.out.print(splitStr[i].charAt(j));
             System.out.print(" ");
         }
        test--;
        }System.err.println();
}
}
