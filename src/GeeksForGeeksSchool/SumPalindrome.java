/*
 * Given a number, reverse it and add it to itself unless it becomes a palindrome or the the count becomes 5 times. If it becomes a palindrome then print that palindrome number, otherwise print -1.

Input: First line of the input contains an integer T denoting the number of test cases. Each test case has a single line containing a number.

Output: Corresponding to each test case, print the palindrome number or -1 as stated above.

Constraints:
1 <= T <= 200
1 <= N <=1000

Example:
Input:
2
23
30
Output:
55
33
 */
package GeeksForGeeksSchool;

import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class SumPalindrome {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test;
        
        test=sc.nextInt();
        
        while(test>0)
        {
        int num=0,palindrome=0,sum=0;
        int rev=0,SumRev=0;
        
            num=sc.nextInt();
            int number=num;
        while (num != 0)
        { 
             rev = rev*10 + num % 10;
             num /= 10;
        }
        sum=number+rev; 
                // System.out.println(rev);

         //System.out.println(sum);
        int SumOfNumAndRev=sum;
        
        while(sum!=0)
        {
        SumRev=SumRev*10 + sum%10;
        sum/=10;
        }
               // System.out.println(SumRev);

        palindrome=SumOfNumAndRev-SumRev;
       // System.out.println(palindrome);

            if(palindrome<=0)
                System.out.println(SumOfNumAndRev);
            else
                System.out.println(-1);
        test--;}
    }
    
}
