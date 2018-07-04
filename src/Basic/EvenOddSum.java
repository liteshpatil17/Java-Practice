/*
 * Given an array Arr[] of N integers, write a program to find the sum of values of even and odd index positions separately.

Input: 
First line of input contains a single integer T which denotes the number of test cases. Then T test cases follows. First line of each test case contains a single integer N which denotes the number of elements in the array. Second line of each test case contains N space separated integer which denotes the elements of the array.
Output:
For each test case, in first line print the sum of elements of array present at even indexes and in the second line print the sum of elements at odd indexes.

Constraints:
1<=T<=100
1<=N<=1000
1<=Arr[i]<=105

Example:
Input:
2
6
1 2 3 4 5 6
7
10 20 30 40 50 60 70
Output:
9
12
160
120
 */
package Basic;

import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class EvenOddSum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            int even=0,odd=0,i;
            
            for(i=0;i<a.length;i++)
                a[i]=sc.nextInt();
                
            for(i=0;i<a.length;i++)
            {
//                System.out.println(a[i]);
                if(i%2==0)
                   even=even+a[i];
                else
                    odd=odd+a[i];
            }
            System.out.println(even);
            System.out.println(odd);
            
         test--;}
        
    }
}
