/*
 * Given a string - "str", find the repeated character present first in the string.

Example : 
Input  :  geeksforgeeks
Output :  g
          (mind that it will be g, not e.)

Input : 
The first line of input contains an integer T denoting the Test cases. Then T test cases follow. 
Second line contains the string - "str"

Output : 
repeated character present first in the string, if present
otherwise print "-1"


Input : 
3
hello
fg
geeksforgeeks

Output : 
l
-1
g
 */
package Basic;

import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class RepeatedCharacter {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
        String str=sc.next();
        char ans=0;
        
        outer:for(int i=0;i<=str.length()-1;i++)
        {
            int count=0;
            for(int j=0;j<=str.length()-1;j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                                    //System.out.println(str.charAt(i)+" "+str.charAt(j));
                    count++;
                    if(count==2){
                        ans=str.charAt(i);
                        break outer;
                    }
                }
            }
        }       
        
        
        if(ans==0)
            System.out.println(-1);
        else
            System.out.println(ans);

        test--;
        }
    } 
}
