
import java.util.Scanner;

/*
 * Print a ‘Y’ shaped pattern from asterisks in N number of lines.

Note: N is even.

Input:

The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consists of a single line contanining an integer N.

Output:
Corresponding to each test case,in a new line, print Y shaped pattern from asterisks in a single line considering spaces.

Constraints:
1 ≤ T ≤ 100
4 ≤ N ≤ 200

Example:
Input
2
4
8
package GeeksForGeeksSchool;

/**
 *
 * @author Litesh
 */
public class YShapedPattern {
      public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
            int n=sc.nextInt();
            
            for(int row=1;row<=n;row++)
            {
            for(int column=1;column<=n;column++)
            {
                if(column==row || column==n-row)
                    System.out.print('*');
                else
                    System.out.print(" ");
               
            }
            System.out.println();
            }
        test--;
        }
        }
}
