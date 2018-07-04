/*
 *Find Index
Show Topic Tags     
Given an unsorted array Arr[] of N integers and a Key which is present in this array. You need to write a program to find the start index( index where the element is first found from left in the array ) and end index( index where the element is first found from right in the array ).

Input:
Fisrt line of input contains an integer T which denotes the number of test cases. First line of each test case contains a single integer N which denotes the number of elements in the array. Second line of each test case contains N space separated integers. Third line of each test case contains the key to be searched.

Output:
For each test case print two space separated integeres, first is the start index and second is the end index. If the key doesnot exist in the array then print -1 in this case.

Constraints:
1<=T<=100
1<=N<=105
1<=Arr[i]<=104

Example:
Input:
2
6
1 2 3 4 5 5
5
6
6 5 4 3 1 2
4
Output:
4 5
2 2
 */
package GeeksForGeeksSchool;

import java.util.Arrays;
import java.util.Scanner;
import java.math.*;
/**
 *
 * @author Litesh
 */
public class FindIndex {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int test=sc.nextInt();
    for(int i=0;i<test;i++)
    {
     int arrLen=sc.nextInt();
     int arr[]=new int[arrLen];
     for(int j=0;j<arrLen;j++)
     {
         arr[j]=sc.nextInt();
     }
     int ele=sc.nextInt();
     int firstIndex=0,lastIndex=arrLen-1,flag=0;
     System.out.println(Arrays.asList(arr).contains(ele));
     
        for(int m=0;m<arrLen;m++)
        {
            if(arr[m]==ele)
            { flag=1;
               return ;}
            else
                flag=0;
        }
     
     if(flag==1)
     {
     while(arr[firstIndex]!=ele)
     { 
         firstIndex++;
     
     }

     while(arr[lastIndex]!=ele)
         lastIndex--;
         
     System.out.println(firstIndex+" "+lastIndex);
    }
     else
         System.out.println(-1);
    }
    }
    
}
