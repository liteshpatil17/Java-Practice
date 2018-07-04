//Given an array, write a program to add the minimum number(should be greater than 0) to the array so that the sum of array becomes even
//
//Input:
//The first line of input contains an integer T denoting the number of test cases. The first and last line of each test case consists of an integer n. Next line of each test case cinsists of n spaced integers.
//
//Output:
//Print the minimum number required to the array so that the sum becomes even .
//
//Constraints: 
//1<=T<=100
//1<=n<=1000
//1<=a[i]<=100000
//
//Example:
//Input:
//2
//8
//1 2 3 4 5 6 7 8
//9
//1 2 3 4 5 6 7 8 9
//
//Output:
//2
//1
package GeeksForGeeksSchool;

import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class MinimumNumbeToFormTheSumEven {
    public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         int test=sc.nextInt();
         for(int t=1;t<=test;t++)
         {
         int arr[]=new int[sc.nextInt()];
         int num,sum=0;
         for(int i=0;i<arr.length;i++)
            {   
                num=sc.nextInt();;
                sum=sum+num;
                arr[i]=num;
                //System.out.print(arr[i]+" ");
            }
                //System.out.println(sum);
            
            if(sum%2==0)
                System.out.println(2);
            else
                System.out.println(1);
         }
    }
    
}
