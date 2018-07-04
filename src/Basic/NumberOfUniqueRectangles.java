/*
 * You are given N unit squares (squares with side length 1 unit), the task is to make rectangles using these squares and to count the number of rotationally unique rectangles. Two rectangles are rotationally unique if one can’t be rotated to become equivalent to the other one.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains a number N i.e., number of unit squares.

Output:
For each test case, print the count of rotationally unique rectangles in new line.

Constraints:
1<=T<=500
1<=N<=106

Example:
Input:
2
4
5

Output:
5
6

Explanation:

For first test case: 
Input : N = 4
Output : 5
Total rectangles we can make from 4 unit squares are:
1x1, 1x2, 1x3, 2x2, 1x4, 2x1, 3x1, 4x1 
But we can get 2x1, 3x1, 4x1 by rotating 1x2, 1x3, 1x4.
So these five rectangles are rotationally unique.
1 x 1, 1 x 2, 2 x 2, 1 x 3 and 1 x 4  
 */
package Basic;

import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class NumberOfUniqueRectangles {
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
            
        test--;}
    }
    
}
