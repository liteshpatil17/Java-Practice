/*
 * Given a string S , write a program to check if all the characters of the string are same or not.

Input:
The first line of input contains a single integer T which denotes the number of test cases. Then T test cases follows. First line of each test case contains a string S.

Output:
For each test case print "YES" without quotes if all the characters of the string S are same otherwise print "NO".

Constraints:
1<=T<=100
1<=length(S)<=104

Example:
Input:
2
geeks
gggg
Output:
NO
YES
 */
package GeeksForGeeksSchool;

import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class CheckString {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test = sc.nextInt();
       for(int i=1;i<=test;i++)
       {   
           int flag=2;
           String str1=sc.next();
           char arr[]=str1.toCharArray();
           char firstChar=arr[0];
           for(int j=0;j<arr.length ;j++)
            {
                
                    if(firstChar==arr[j])
                        flag=1;
                    else
                        flag=0;
                }
            
           if(flag==1)
               System.out.println("YES");
           else if(arr.length==1)
               System.out.println("NO");
           else
               System.out.println("NO");

       
    }
}
}
