/*
 * Given a number N, Write a program to find a number which is greater than or equal to N and is a smallest power of 2.

Input:
First line of input contains a single integer T which denotes the number of test cases. Then T test cases follows. First line of each test case contains a single integer N.

Output:
For each test case, print a number which is greater than or equal to N and is a nearest power of 2.

Constraints:
1<=T<=100
1<=N<=100000

Example:
Input:
4
5
1
17
32
Output:
8
1
32
32
 */
package Basic;

import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class SmallestPowerOf2greaterThanEqualToN {
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
            int N=sc.nextInt();
            int i=0;
            for(;;i++)
            {
                if((int)Math.pow(2,i)>= N)
                    break;
            }
            
            System.out.println((int)Math.pow(2,i));
        test--;}
    }
}
