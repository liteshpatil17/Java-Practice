/*
 * Given an array of n distinct elements. Find the length of shortest unordered (neither increasing nor decreasing) sub array in given array.

Input:
The first line consists of an integer T i.e number of test cases. The first line of each test case consists of an integer n.The next line consists of n spaced numbers. 

Output:
Print the required output.

Constraints: 
1<=T<=100
1<=n<=100
1<=a[i]<=105

Example:
Input:
2
5
7 9 10 8 11
4
1 2 3 5

Output:
3
0
 */
package Basic;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Litesh
 */
public class ShortestUnorderedSubarray {
    
    public int findUnsortedSubarray(int[] nums) {
        Stack < Integer > stack = new Stack < Integer > ();
        int l = nums.length, r = 0;
        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] > nums[i])
                l = Math.min(l, stack.pop());
            stack.push(i);
        }
        stack.clear();
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i])
                r = Math.max(r, stack.pop());
            stack.push(i);
        }
        return r - l > 0 ? r - l + 1 : 0;
    }


    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
            int len=sc.nextInt();
            int arr[]=new int[len];
            
            for(int i=0;i<len;i++)
                arr[i]=sc.nextInt();
            
            int subArrLen=findUnsortedSubarray(arr);
            
            System.out.println(subArrLen);
        test--;}
    }
}
