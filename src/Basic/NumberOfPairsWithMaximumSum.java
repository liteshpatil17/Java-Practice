/*
 *Given an array arr[], count number of pairs arr[i], arr[j] such that arr[i] + arr[j] is maximum and i < j.

Example:
Input  : arr[] = {1, 1, 1, 2, 2, 2}
Output : 3
Explanation: The maximum possible pair
sum where i is less than j is  4, which is given 
by 3 pairs, so the answer is 3
the pairs are (2, 2), (2, 2) and (2, 2).

CONSTRAINTS:
1<=T<=100
1<=a[i],n<=105

INPUT:
2
6
1 1 1 2 2 2
6
1 4 3 3 5 1
OUTPUT:
3
1
 */
package Basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class NumberOfPairsWithMaximumSum {
 
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
        
        Arrays.sort(arr);
        int sum=arr[len-1]+arr[len-2];
        int count=0;
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if(arr[i]+arr[j]==sum)
                    count++;
            }
        }
        
        System.out.println(count);
        test--;}
        
    }
}
