/*
 * Two strings are given. Modify 1st string such that all the common characters of the 2nd strings have to be removed and the uncommon characters of the 2nd string have to be concatenated with uncommon characters of the 1st string.

Note: If the modified string is empty then print '-1'.

Input:
The first line consists of an integer T i.e number of test cases. The first line of each test case consists of an string s1.The next line consists of an string s2. 

Output:
Print the required output.

Constraints: 
1<=T<=100
1<=|Length of Strings|<=100

Example:
Input:
2
aacdb
gafd
abcs
cxzca

Output:
cbgf
bsxz
 */
package Basic;

import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class RemoveCommonCharactersAndConcatenate {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
            String str1=sc.next();
            String str2=sc.next();
            
            StringBuffer sb1=new StringBuffer(str1);
            StringBuffer sb2=new StringBuffer(str2);

            
            for(int i=0;i<=sb2.length()-1;i++)
            {int j=0;
                  while(sb2.charAt(i)==sb1.charAt(j))
                  {
                     sb1.deleteCharAt(j);
                     j++;
                  }
                  System.out.println(sb1);

                }
        test--;}
    }
}
