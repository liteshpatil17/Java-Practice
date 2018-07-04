/*
 * Given a string and array of strings, find whether the array contains a string with one character difference from the given string. Array may contain strings of different lengths.

Examples:

Input : str = "banana"
        arr[] = {"bana", "apple", "banaba", bonanzo", "banamf"}
Output :True
Explanation:Only one character difference between banana and banaba
Example : 
Input : 
The first line of input contains an integer T denoting the Test cases. Then T test cases follow. 
Second line contains No. of elements in arr[] - N
Third line contains a[i] elements
Fourth line contains string - str

Output : 
True if there is only one mismatch(by character), else False

Constraints :
1 ≤ T ≤ 50
1 ≤ N ≤ 100
1 ≤ arr[i] ≤ 1000

Input : 
1
4
gold flow cood code
cold

Output : 
True
 */
package Basic;

import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class JustOneMismatch {
   
    static int Miss(String arr[],int n,String str)
    {
        int miss=0;
        for(int i=0;i<n;i++)
            {
                miss=0;
                if(str.length()!=arr[i].length())
                    continue;
                for(int j=0;j<str.length();j++)
                {
                    if(arr[i].charAt(j)==str.charAt(j))
                        continue;
//                    {System.out.println(arr[i]+" "+arr[i].charAt(j)+" "+str.charAt(j));}
                    else
                        miss++;
                }
                 if(miss==1)
                {
                break;}
            }
        return miss;
    }
    
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
            int n=sc.nextInt();
            String arr[]=new String[n];
            int miss=0;
            for(int i=0;i<n;i++)
               arr[i]=sc.next();
            
            String str=sc.next();
            
            if(Miss(arr,n,str)==1)
                System.out.println("True");
            else    
                System.out.println("False");

            test--;
        }
    }
}
