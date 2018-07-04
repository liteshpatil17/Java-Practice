/*
 * Given a string without spaces, a character, and a count, the task is to print the string after the specified character has occurred count number of times.
Print “Empty string” incase of any unsatisfying conditions.
(Given character is not present, or present but less than given count, or given count completes on last index).
If given count is 0, then given character doesn’t matter, just print the whole string.

 

Input:

First line consists of T test cases. First line of every test case consists of String S.Second line of every test case consists of a character.Third line of every test case consists of an integer.


Output:

Single line output, print the remaining string or "Empty string".


Constraints:

1<=T<=200
1<=|String|<=10000


Example:

Input:

2
Thisisdemostring
i    
3​
geeksforgeeks
e
2

Output:
ng
ksforgeeks
 */
package Basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class RemainingString {
       public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
            String str=sc.next();
            char ch=sc.next().charAt(0);
            int countReq=sc.nextInt();
            int count=0;int index=0;
            
            for(int i=0;i<str.length();i++)
            {
                index=i;
                if(str.charAt(i)==ch)
                    count++;
                if(count==countReq)
                    break;
            }
            if(count<countReq || str.length()==index+1)
            {
                System.out.println("Empty string");
            }
            else if(count==countReq && countReq!=0)
                    System.out.println(str.substring(index+1, str.length()));
            else if(countReq==0)
                {
                    System.out.println(str);

                }
            
        test--;}
    }
}
