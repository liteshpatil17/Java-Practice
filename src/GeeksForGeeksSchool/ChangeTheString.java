/*Given a string S, the task is to change the string according to the condition; If the first letter in a string is capital letter then change the full string to capital letters, else change the full string to small letters.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains a string S.

Output:
For each test case, print the changed string in a new line.

Constraints:
1<=T<=200
1<=|string length|<=104

Example:
Input:
2
geEkS
FoR
Output:
geeks
FOR
 */
package GeeksForGeeksSchool;

/**
 *
 * @author Litesh
 */
import java.util.Scanner;
import java.util.regex.Pattern;

public class ChangeTheString {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int test=sc.nextInt();
    for(int t=1;t<=test;t++)
        {
           String str=sc.next();
           StringBuffer s=new StringBuffer(str);
            char a=(char)s.charAt(0);
            if(Character.isUpperCase(a))
            {
                String Upper=str.toUpperCase();
                System.out.println(Upper);

            }
                else
            {  
                String Lower=str.toLowerCase();
                System.out.println(Lower);
            
            }
       }
    }
    
}
