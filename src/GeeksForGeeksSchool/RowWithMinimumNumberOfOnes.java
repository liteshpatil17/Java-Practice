/*
 * Determine the row index with minimum number of ones. The given 2D matrix has only zeroes and ones and also the matrix is sorted row wise . If two or more rows have same number of 1's than print the row with smallest index.

Note: If there is no '1' in any of the row than print '-1'.

Input:
The first line of input contains an integer T denoting the number of test cases. The first line of each test case consists of two integer n and m. The next line consists of n*m spaced integers. 

Output:
Print the index of the row with minimum number of 1's.

Constraints: 
1<=T<=200
1<=n,m<=100

Example:
Input:
2
3 3
0 0 0 0 0 0 0 0 0
4 4
0 0 0 1 0 1 1 1 0 0 1 1 0 0 1 1

Output:
-1
0
 */
package GeeksForGeeksSchool;

import java.util.Arrays;
import java.util.TreeMap;
import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class RowWithMinimumNumberOfOnes {
   	public static void main (String[] args) {
		//code
		int t,n,m,min=0,index=-1;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		while(t>0)
		{
		    n=sc.nextInt();
		    m=sc.nextInt();
		    int[][]a=new int[n][m];
		    for(int i=0;i<n;i++)
		        {
		        for(int j=0;j<m;j++)
		                a[i][j]=sc.nextInt();
		        }
		        min=0;
		      for(int i=0;i<n;i++)
		        {
		           int count=0;
		            for(int j=0;j<m;j++)
		            {
		                 if(a[i][j]==1)
		                 count++;
		            } 
		              if((count!=0&&min==0)||(count<min&&count!=0))
		              {
		              min=count;
		              index=i;
		              }
		              
		                      /*if()
		                      {
		                        min=count;
		                        index=i;
		                      }*/
		        }           
                         System.out.println(index);
		  t--;        
		}
	}
}
        
    
    

