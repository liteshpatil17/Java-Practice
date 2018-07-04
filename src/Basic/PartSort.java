/*
 *Given an array A[N], you are required to sort the array in given index range [a, b], i.e., you need to sort subarray A[a..b]

Example:
Input: 
A[] = {7, 8, 4, 5, 2}
a = 1 , b = 4
Output : 
 7 2 4 5 8

Example : 
Input : 
The first line of input contains an integer T denoting the Test cases. Then T test cases follow. 
First line contains no. of array elements - N
Second line contains array elements A[i]
Third line contains a and b

Output : 
Sorted array as per the given range [a, b] 

Constraints :
1 ≤ T ≤ 100
1 ≤ N ≤ 10^5
0 ≤ A[i] ≤ 10^6
0 ≤ a, b ≤ N-1

Input : 
1
5
7 8 4 5 2
1 4

Output : 
7 2 4 5 8
 */
package Basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class PartSort {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            
            for(int i=0;i<arr.length;i++)
                arr[i]=sc.nextInt();
            
            int a=sc.nextInt();
            int b=sc.nextInt();
            
            if(b>a)
                 Arrays.sort(arr, a, b+1);
            else
                Arrays.sort(arr, b, a+1);
            
//            System.out.println(Arrays.toString(arr));
            
            for(int i=0;i<arr.length;i++)
                System.out.print(arr[i]+" ");
                
            System.out.println();
            
        test--;}
    }
}
