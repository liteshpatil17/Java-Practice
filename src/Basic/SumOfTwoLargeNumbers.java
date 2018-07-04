/*
 * Given two non-negative numbers X and Y. The task is calculate the sum of X and Y.

Input:

The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains two numbers X and Y.

Output:
For each test case, if the number of digits in sum (X+Y) are equal to the number of digits in X, then print sum, else print X.

Constraints:
1<=T<=500
1<=|Number length |<=100

Example:
Input:
2
25 23
3 5

Output:
48
8
 */
package Basic;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class SumOfTwoLargeNumbers {
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
           String num1=sc.next();   
           String num2=sc.next();
           
           BigInteger Bnum1=new BigInteger(num1);      
           BigInteger Bnum2=new BigInteger(num2);
           BigInteger sum= Bnum1.add(Bnum2);
           if(sum.toString().length()==Bnum1.toString().length())
               System.out.println(sum.toString());
           else
               System.out.println(Bnum1.toString());



           
        test--;}
    }
}
