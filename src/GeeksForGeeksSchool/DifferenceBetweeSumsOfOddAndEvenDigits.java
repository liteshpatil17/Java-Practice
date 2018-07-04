//Given a long integer, we need to find if the difference between sum of digits present at the odd positions and sum of digits present at even positions is 0 or not. The indexes start from zero (0 index is for leftmost digit).
//
//Input:
//First line consists of T test cases. Only line of every test case consists of a number N.
//
//Output:
//Print "Yes" if difference is 0 else print "No".
//
//Constraints:
//1<=T<=300
//1<=N<=10^18
//
//Example:
//Input:
//2
//1212112
//123
//Output:
//Yes
//No

package GeeksForGeeksSchool;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class DifferenceBetweeSumsOfOddAndEvenDigits {

        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            int test=sc.nextInt();
           for(int t=1;t<=test;t++)
           {
            int i = 0;
            BigInteger number=sc.nextBigInteger();
            String str=number.toString();
            int n=str.length();
            char a[]=str.toCharArray();
            int b[]=new int[n];
            for(int j=0,s=0;j<a.length && s<a.length;j++,s++)
                    {
                        b[j]=Character.digit(a[s],10);
                       // System.out.print(" "+b[j]);
                    }
            int evenSum=b[0];
            int oddSum=0;
            
            for(int m=2;m<b.length;m=m+2)
                {
                    evenSum=evenSum+b[m];
                   // System.out.println("Even="+evenSum);
                }
            for(int m=1;m<b.length;m=m+2)
                {
                    oddSum=oddSum+b[m];
                    //System.out.println("odd="+oddSum);
                }
            int diff=oddSum-evenSum;
            
            if(diff!=0)
                System.out.println("No");
            else
                System.out.println("Yes");
        }
     }
}
