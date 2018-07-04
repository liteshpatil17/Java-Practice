/*
 * Write a program that receives a number as input and prints it in the following format as shown below.
Examples:

Input : n = 3

Output :

1*2*3*10*11*12
--4*5*8*9
----6*7

Input : n = 4

Output :

1*2*3*4*17*18*19*20
--5*6*7*14*15*16
----8*9*12*13
------10*11

Input:
The first line consists of an integer T i.e number of test cases. The first and only line of each test case consists of an integer n. 

Output:
Print the required output as a pattern a given in examples.

Constraints: 
1<=T<=100
1<=n<=70

Example:
Input:
1
3

Output:
1*2*3*10*11*12

--4*5*8*9

----6*7
 */
package Basic;

import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class PrintThePattern
{
public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
//        int test=sc.nextInt();
//        while(test>0)
//        {
         int n=sc.nextInt();
         int a=20;
         int b=(n)*(n+1);
         
         for(int i=0;i<n;i++)
         {
//             for(int j=0;j<i*2;j++)
//             {
//                 System.out.print("-");
//             } 
//             
//             for(int k=1;k<=n-i;k++)
//             {
//             System.out.print(a+"*");
//             a++;
//             }
             
             for(int m=0;m<n-i;m++)
             {
                 for(int p=1;p<=n-i;p++)
                 {
                     System.out.print(a+"*");
                     a--;
                 }
                              System.out.println("");

             }
         

         }

    }
            
//        test--;}
//    }    
    
}
