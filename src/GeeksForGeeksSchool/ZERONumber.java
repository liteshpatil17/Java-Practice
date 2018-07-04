//A ZERO number is a number which has zeroes present in it, but there should be no zero present in the beginning of the number. For example 3210, 8050896, 70709 are all ZERO numbers whereas 02364, 03401 are not.
//The task is to check whether the given number is a ZERO number or not.
//
//Examples:
//Input : 707069
//Output : It is a ZERO number.
//Explanation: 707069 does not contains zeros at the beginning.
//
//Input : 02364
//Output : It is not a ZERO number.
//Explanation: in 02364 there is a zero at the beginning of the number.
//Input : 
//The first line of input contains an integer T denoting the Test cases. Then T test cases follow. 
//Second line contains value of N.
//
//Output : 
//Yes, if N is ZERO Number; else NO
//
//Constraints :
//1 ≤ T ≤ 150
//1 ≤ N ≤ 100000
//
//Input : 
//3
//0
//10001
//11111
//
//Output :
//YES
//NO
//YES
package GeeksForGeeksSchool;

import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class ZERONumber {
    
    public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            int test=sc.nextInt();
            for(int i=1;i<=test;i++)
            {
            String s=sc.next();
            if(s.charAt(0)=='0')
                System.out.println("NO");
            else
            {
                if(s.contains("0"))
                     System.out.println("YES");
                else
                System.out.println("YES");

            }
            }
        }
}
