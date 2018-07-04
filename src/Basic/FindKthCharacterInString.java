/*
 * Given a decimal number m. Convert it in binary string and apply n iterations, in each iteration 0 becomes 01 and 1 becomes 10. Find kth character in the string after nth iteration.

Input:
The first line consists of an integer T i.e number of test cases. The first and only line of each test case consists of three integers m,k,n. 

Output:
Print the required output.

Constraints: 
1<=T<=100
1<=m<=50
1<=n<=10
0<=k<=|Length of final string|

Example:
Input:
2
5 5 3
11 6 4

Output:
1
1
 */
package Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class FindKthCharacterInString {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
            int m=sc.nextInt();
            int k=sc.nextInt();
            int n=sc.nextInt();
            
            String bin=Integer.toBinaryString(m);
            
            StringBuilder sb=new StringBuilder(bin);
            StringBuilder sb1=new StringBuilder();

           //System.out.println(sb.length()); 
            for(int i=1;i<=n;i++)
            {
//                System.out.println("before = "+sb1.toString());
                int len=sb.length()-1;
                for(int j=0;j<=len;j++)
                 {
//                   System.out.println(sb.charAt(j));
                    if(sb.charAt(j)=='0')
                        sb1.append("01");
                    else if(sb.charAt(j)=='1')
                        sb1.append("10");
                 }
               sb.delete(0, len+1);
               sb=sb1;
//                System.out.println("sb = "+sb.toString());
//                System.out.println("after = "+sb1.toString());
            }
            
            System.out.println(sb.charAt(k));
           
        test--;}
    }
    
}


