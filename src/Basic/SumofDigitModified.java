/*
 * A number is said to be a magic number, if the sum of its digits are calculated till a single digit recursively by adding the sum of the digits after every addition. If the single digit comes out to be 1,then the number is a magic number.

Input:
First line of input contains a single integer T, denoting the number of test cases. First line of each test case contains an integer N.
 

Output:
For each of the test case print whether the number N is "Magic" or "Not Magic"


Constraints:
1<=T<=10^5
1<=N<=10^5


Example:

Input:
2
1234
67

Output
Magic
Not Magic

Explanation:
1234 sums up to 10 which sums upto 1 so its a Magic Number.
67 sums up to 11 which sums upto 2 so its not a Magic Number
 */
package Basic;

import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class SumofDigitModified {
    
    static int magic(int num)
        {
        int sum=0;
        while(num!=0)
        {
             sum=sum+(num%10);
             num/=10;
            // System.out.println("Sum "+sum);

        }
        return sum;
        }
 
    public static void main(String args[])
    {
               Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
            int num=sc.nextInt();
            int sum=magic(num);
            while(true)
            {
                if(sum>=10)
                   sum=magic(sum);
                else
                    break;
            }
            if(sum==1)
                System.out.println("Magic");
            else
                System.out.println("Not Magic");
        test--;}
    }
    
}
