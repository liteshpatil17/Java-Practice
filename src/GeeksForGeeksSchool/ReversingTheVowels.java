/*
 * Given a string, reverse only the vowels present in it and print the resulting string.


Input: First line of the input file contains an integer T denoting the number of test cases. Then T test cases follow. Each test case has a single line containing a string.

Output: Corresponding to each test case, output the string with vowels reversed.

Example:

Input:
4
geeksforgeeks
practice
wannacry
ransomware

Output:
geeksforgeeks
prectica
wannacry
rensamwora
 */
package GeeksForGeeksSchool;

import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class ReversingTheVowels {
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test =sc.nextInt();
        while(test>0)
        {
            String str=sc.next().toLowerCase();
            String vov="";
            
            
            for(int j=(str.length()-1);j>=0;j--)
            {
                if(str.charAt(j)=='a'|| str.charAt(j)=='e' || str.charAt(j)=='i' ||str.charAt(j)=='o' || str.charAt(j)=='u')
                {
                    vov=vov+str.charAt(j);
                }
            }
            
         //   System.out.println(vov);
            int indVov=0;
           
            for(int k=0;k<str.length();k++)
            {
               if(str.charAt(k)=='a'|| str.charAt(k)=='e' || str.charAt(k)=='i' ||str.charAt(k)=='o' || str.charAt(k)=='u')
                {
                    System.out.print(vov.charAt(indVov));
                    indVov++;
                }
               else
                   System.out.print(str.charAt(k));
            }
                               System.out.println();

            
        test--;}
    }
}
    
