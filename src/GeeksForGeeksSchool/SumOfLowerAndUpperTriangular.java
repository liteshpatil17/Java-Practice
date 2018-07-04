//Given a matrix print the sum of upper and lower triangular elements. Upper Triangle consists of elements on the diagonal and above it. Lower triangle consists of elements on the diagonal and below it. 
//
//Input:
//The first line consists of an integer T i.e number of test cases. The first line of each test case consists of an integer n. The next line contains n*n spaced integers.
//
//Output:
//Print the required output.
//
//Constraints: 
//1<=T<=100
//1<=n,a[i][j]<=100
//
//Example:
//Input:
//1
//3
//6 5 4 1 2 5 7 9 7
//Output:
//29 32
package GeeksForGeeksSchool;

import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class SumOfLowerAndUpperTriangular {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        int n =sc.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        
//        for(int i=0;i<n;i++)
//        {
//            System.out.println("");
//            for(int j=0;j<n;j++)
//            {
//                        System.out.print(a[i][j]+" ");
//            }
//        }
        
        int LowerMat=0;
        int UpperMat=0;
        
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                UpperMat=UpperMat+a[i][j];
        
            }
        }
             
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                LowerMat=LowerMat+a[i][j];
        
            }
        }
        System.out.print(LowerMat+" "+UpperMat);
    }
    
}
