/*
 * Given a sorted array having 10 elements which contains 6 different numbers in which only 1 number is repeated five times. Your task is to find the duplicate number using two comparisons only.

Examples:

Input: A[] = {1, 1, 1, 1, 1, 5, 7, 10, 20, 30}
Output: 1

Input: A[] = {1, 2, 3, 3, 3, 3, 3, 5, 9, 10}
Output: 3


Input:
The first line of input contains an integer T denoting the no of test cases. Then T test cases follow . Each test case contains 10 space separated values of the array A[].

Output:
For each test case in a new line print the required duplicate element.

Constraints:
1<=T<=100
1<=A[]<=10^5+5

Example:
Input:
2
1 2 4 5 6 9 9 9 9 9
1 2 3 3 3 3 3 5 9 10

Output:
9
3
 */
package GeeksForGeeksSchool;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class FindDuplicatesUnderGivenConstraints {
      public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int test;
        test=scan.nextInt();
        while(test>0)
        {
            int i=0,repeted=-1;
            int arr[]=new int[10];
            while(i!=arr.length)
            {
                arr[i]=scan.nextInt();
            i++;}
            
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]==arr[j+1] && arr[j]==arr[j+2] && arr[j]==arr[j+3] && arr[j]==arr[j+4])
                {
                    repeted=arr[j];
                    break;
                }
            
            }
            System.out.println(repeted);
            
        test--;}
    }
}
