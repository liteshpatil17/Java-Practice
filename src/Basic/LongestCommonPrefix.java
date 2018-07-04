/*
 * Given two string str1 and str2(of lower case alphabets) of same length. Find the longest common prefix from str1 and str2.

NOTE: If there is no common prefix then print "-1".

INPUT: First line of the input is T denoting the number of test cases. Each test case takes two strings as input.

OUTPUT: Print the index from where the longest common prefix of str1 is found in str2 and the longest common prefix with a space in between.

CONSTRAINTS:
1<=T<=100
1<=Length of strings<10000

Examples:
INPUT:
2
geeks
dgeek
practicegeeks
coderpractice

OUTPUT:
1 geek
5 practice
 */
package Basic;

import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class LongestCommonPrefix {
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
        int start=sb2.indexOf(Character.toString(sb1.charAt(0)));
        int len=0;
       if(start==-1)
       {
        System.out.println("-1");
       }
       else
       {
            for(int i=start,j=0;i<sb2.length() && j<sb2.length();i++,j++)
                {
                    if(sb2.charAt(i)==sb1.charAt(j))
                          len++;                           
                    else
                         break;
                }
            System.out.println(start+" "+sb1.substring(0, len));
       }
    
    test--;}
}
}
