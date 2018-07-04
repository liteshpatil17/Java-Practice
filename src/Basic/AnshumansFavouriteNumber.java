/*
 * You are given an integer input N and you have to find whether it is Anshuman’s favourite or not.

If it is then print “YES” else print “NO”.

A number is Anshuman’s favourite if it is either the sum or the difference of the integer 5. (5+5, 5+5+5, 5-5,5-5-5+5+5…..)

Input:
The first line of input contains an integer denoting the number of test cases . Next line of input contains an integer N to be tested.    

Output:
For each test case , the output is in a new line containg the answer 'YES' or 'NO' depending on whether the given number N is Anshuman's favourite or not .

Constraints:
1<=T<=100
-10^9<=N<=10^9

Example:
Input : 
1
10
Output : 
YES

Because 10 can be written as a sum of 5+5.

Example:
Input : 
1
9
Output : 
NO

Input :
2
-255
389
Output :
YES
NO
 */
package Basic;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class AnshumansFavouriteNumber {
   public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
        String num=sc.next();
        BigInteger arr[]=new BigInteger[2];
        BigInteger bi=new BigInteger(num,10);
        BigInteger five=new BigInteger("5",10);
        BigInteger zero=new BigInteger("0");

        arr=bi.divideAndRemainder(five);
        
        BigInteger rem=arr[1];
        //System.out.println(arr[1]);
        
        if(rem.compareTo(zero)==0)
            System.out.println("YES");
        else            
            System.out.println("NO");

            
        test--;
        }
        
    }
    
}
