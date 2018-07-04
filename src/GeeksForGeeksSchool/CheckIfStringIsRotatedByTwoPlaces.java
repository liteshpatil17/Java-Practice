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
public class CheckIfStringIsRotatedByTwoPlaces {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test;
        test=sc.nextInt();
        while(test>0)
        {
            String str=sc.next();
            String strToRotate=sc.next();
            String orignal=str;
            StringBuilder sb=new StringBuilder(str);
            StringBuilder sb1=new StringBuilder(strToRotate);
            StringBuilder sbAnti=new StringBuilder();
            StringBuilder sbClock=new StringBuilder();

            sbAnti.append(sb1.charAt(sb1.length()-2));
            sbAnti.append(sb1.charAt(sb1.length()-1));
//            System.out.println(sb2.charAt(0));
//            System.out.println(sb2.charAt(1));
            

            for(int i=2 ;i<sb.length();i++)
            {
            sbAnti.append(sb.charAt(i));
            }
            
           for(int i=0 ;i<sb.length()-2;i++)
           {
              sbClock.append(sb.charAt(i)); 
           }
            sbClock.append(sb1.charAt(0));
            sbClock.append(sb1.charAt(1));
         String Anti=sbAnti.toString();
         String Clock=sbClock.toString();
            if(Clock.equals(orignal))
                System.out.println(1);
            else if(Anti.equals(orignal))
                 System.out.println(1);
            else
                System.out.println(0);
               

            

            
            
        test--;}}
    
}
