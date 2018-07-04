/*
 *A Krishnamurthy number is a number whose sum of the factorial of digits is equal to the number itself. Given a number N as input. Write a program to check whether this number is krishnamurthy number or not.

Input:
First line of input contains a single integer T which denotes the number of test cases. Then T test cases follows. First line of each test case contains a single integer N.

Output:
For each test case print "YES" without quotes if N is a Krishnamurthy Number otherwise print "NO".

Constraints:
1<=T<=100
1<=N<=105

Example:
Input:
2
145
235
Output:
YES
NO
 */
package GeeksForGeeksSchool;

import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class KrishnamurthyNumber {
    int factorial(int num)
        {
          int fact=1;
          while(num>1)
          {
          fact=fact*num;
          num--;
          }
          return fact; 
          }
    public static void main(String args[])
    {
        KrishnamurthyNumber obj=new KrishnamurthyNumber();
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        for(int t=0;t<test;t++)
        {
            int lastDigit,sumFact=0,number=sc.nextInt();
            int num=number;
            while(number>0)
            {
                lastDigit=number%10;
                if(lastDigit!=0)
                    {
                        sumFact=sumFact+obj.factorial(lastDigit);
                    }
                number=number/10;
            }
            if(sumFact==num)
                System.out.println("YES");
            else
                System.out.println("NO");

        }
    }
    
}
