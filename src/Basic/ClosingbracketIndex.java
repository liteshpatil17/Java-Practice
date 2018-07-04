/*
Given a string with brackets. If the start index of the open bracket is given, find the index of the closing bracket.

Examples:

Input : string = [ABC[23]][89]
        index = 0
Output : 8
The opening bracket at index 0 corresponds
to closing bracket at index 8.
Constraints:
1<=T<=100
1<=N<=10000
INPUT:
1
[ABC[23]][89]
0
OUTPUT:
8
 */
package Basic;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Litesh
 */
public class ClosingbracketIndex {
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
            String str=sc.next(); 
            int ind=sc.nextInt();
            int ans=0;
            Stack<Character> stack=new Stack<Character>();
            char arr[]=str.toCharArray();
            for(int i=ind;i<arr.length;i++)
            {
                
                if(arr[i]=='[' )
                {
                    stack.push((Character)arr[i]);
                }
                else if(arr[i]==']' && stack.isEmpty()==false)
                {
                    stack.pop();
                    if(stack.isEmpty()==true)
                    {
                        ans=i;
                        break;
                    }
                }
            }
            System.out.print(ans);
            
        test--;}
    }
}
