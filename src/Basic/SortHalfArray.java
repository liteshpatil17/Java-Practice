/*
 * Given an array of integers, sort the first half of the array in ascending order and second half in descending order.

Input:
The first line consists of an integer T i.e number of test cases. The first line of each test case consists of an integers N.The next line consists of N spaced integers. 

Output:
Print the required output.

Constraints: 
1<=T<=100
1<=N<=100
1<=a[i]<=1000

Example:
Input:
2
9
5 2 4 7 9 3 1 6 8
6
1 2 3 4 5 6

Output:
1 2 3 4 9 8 7 6 5
1 2 3 6 5 4
 */
package Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class SortHalfArray {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
            double n=sc.nextDouble();
            int arr[]=new int[(int)n];
            int arr1[]=new int[(int)Math.floor(n/2)];
            Integer arr2[]=new Integer[(int)Math.ceil(n/2)];

            
            for(int i=0;i<arr.length;i++)
                arr[i]=sc.nextInt();
            
             Arrays.sort(arr);

            for(int i=0;i<arr1.length;i++)
                arr1[i]=arr[i];
            
            for(int i=0, j=(int)Math.floor(n/2);i<arr2.length & j<arr.length;i++,j++)
                arr2[i]=arr[j];
            
            
            Arrays.sort(arr2, Collections.reverseOrder());
            
//            System.out.println(Arrays.toString(arr1));
//            System.out.println(Arrays.toString(arr2));    
            
         
            for(int i=0;i<arr1.length;i++)
                 System.out.print(arr1[i]+" ");
            
             for(int i=0;i<arr2.length;i++)
                 System.out.print(arr2[i]+" ");
                
             System.out.println();

             
            test--;}
    }
    
}
