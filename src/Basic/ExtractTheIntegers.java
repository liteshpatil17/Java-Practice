/*
 * Given a string, the task is to extract all the integers from it.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains a string S as input.

Output:
For each test case, print all the integers with one space, if the string does not contain any integers, print "No Integers".

Constraints:
1<=T<=100
1<=S<=105

Example:
Input:
3
geeksforgeeks 12 23 practice
1: Prakhar Agrawal, 2: Manish Kumar Rai, 3: Rishabh Gupta
geeksforgeeks

Output:
12 23
1 2 3
No Integers
 */
package Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Litesh
 */
public class ExtractTheIntegers {
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
            String str=sc.next();
            
            StringBuilder sb=new StringBuilder(str);
            
            for(int i=0;i<str.length();i++)
            {
                while(true)
                {
                    if(Character.isDigit(str.charAt(i)))
                         System.out.println(str.charAt(i));
                    else
                        break;
                }
            }
            
            
        test--;}
    }
}
