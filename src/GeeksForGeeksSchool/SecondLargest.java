/*
 * Given an array of elements. Your task is to find the second maximum element in the array.

Input:
The first line of input contains an integer T which denotes the number of test cases. Then T test cases follows. First line of each test case contains a single integer N which denotes the number of elements in the array. Second line of each test case contains N space separated integers which denotes the elements of the array.
Output:
For each test case in a new line print the second maximum element in the array. If there does not exist any second largest element, then print -1.


Constraints:
1<=T<=100
2<=n<=1000
1<=a[i]<=106


Example:
Input:
2
5
2 4 5 6 7
6
7 8 2 1 4 3
Output:
6
7
 */
package GeeksForGeeksSchool;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class SecondLargest {
    
    
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int test=sc.nextInt();
    
    
    for(int i=0;i<test;i++)
    {
     int arrLen=sc.nextInt();
     int arr[]=new int[arrLen],check=-1;
     for(int j=0;j<arrLen;j++)
     {
         arr[j]=sc.nextInt();
     }
     
      Arrays.sort(arr);
      int max=arr[arrLen-1];
      for(int j=arrLen-1;j>=0;j--)
      {
       if(arr[j]<max)
       {
        check=0;
         System.out.println(arr[j]);
         break;
       }
      } 
      if(check==-1)
        System.out.println(-1);
    }
    System.out.println();

    }
}