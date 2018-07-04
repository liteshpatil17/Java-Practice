/*
 *Given an array of integers, task is to print the array in the order – smallest number, Largest number, 2nd smallest number, 2nd largest number, 3rd smallest number, 3rd largest number and so on..

Input:
The first line consists of an integer T i.e number of test cases. The first line of each test case consists of an integer N.The next line consists of N spaced integers. 

Output:
Print the required answer.

Constraints: 
1<=T<=100
1<=N,a[i]<=1000

Example:
Input:
2
9
1 9 2 8 3 7 4 6 5
4
1 2 3 4 

Output:
1 9 2 8 3 7 4 6 5
1 4 2 3
 */
package Basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class RearrangeTheArray {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            Integer arrRev[]=new Integer[n];
            Integer ans[]=new Integer[n];
            int j=0;
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
                arrRev[i]=arr[i];
            }
            
            Arrays.sort(arr);
            Arrays.sort(arrRev,Collections.reverseOrder());
            int count=0;
           while(true)
           {
               if(count<n)
               {
                   System.out.print(arr[count]);
               }
               else
                   break;
               if(count<n)
               {}   
               else
                   break;
           }
            test--;}
    } 
}
