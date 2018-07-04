/*
 * The task is to find the smallest number with given sum of digits as s and number of digits as d.

Expected Time Complexity: O(d)

Input:
The first line of input contains a single integer T denoting the number of test cases. Then T test cases follow. Each test case consist of a single line containing two space separated integers s and d, where s is digit sum and d is number of digits.

Output:
Corresponding to each test case, in a new line, print the smallest number if possible, else print -1.

Constraints:
1 ≤ T ≤ 100
1 ≤ s ≤ 100
1 ≤ d ≤ 6

Example:
Input
3
9 2
20 3
63 3

Output
18
299
-1
 */
package Basic;

import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class SmallestNumber {
    
    static void minNo(int s,int d)
    {
        if(s==0 || s>9*d)
        { System.out.println(-1);return;}
        
        
        int arr[]=new int[d];
       
        s-=1;
        
         for (int i=d-1; i>0; i--)
        {
            // If sum is still greater than 9,
            // digit must be 9
            if (s > 9)
            {
                arr[i] = 9;
                s -= 9;
            }
            else
            {
                arr[i] = s;
                s = 0;
            }
        }

        arr[0]=s+1;
        
        for(int i=0;i<d;i++)
            System.out.print(arr[i]);
       
         System.out.println();

    }
    
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
            int s=sc.nextInt();
            int d=sc.nextInt();
            int num=0;
            
            minNo(s,d);
            
        test--;}
    }
}
