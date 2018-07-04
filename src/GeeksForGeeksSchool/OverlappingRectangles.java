/*Given two rectangles, find if the given two rectangles overlap or not. A rectangle is denoted by providing the x and y co-ordinates of two points: the left top corner and the right bottom corner of the rectangle.

Note that two rectangles sharing a side are considered overlapping.

rectanglesOverlap

Input:

The first integer T denotes the number of test cases. For every test case, there are 2 lines of input. The first line consists of 4 integers: denoting the co-ordinates of the 2 points of the first rectangle. The first integer denotes the x co-ordinate and the second integer denotes the y co-ordinate of the left topmost corner of the first rectangle. The next two integers are the x and y co-ordinates of right bottom corner. Similarly, the second line denotes the cordinates of the two points of the second rectangle.


Output:

For each test case, output (either 1 or 0) denoting whether the 2 rectangles are overlapping. 1 denotes the rectangles overlap whereas 0 denotes the rectangles do not overlap.


Constraints:

1 <= T <= 10

-10000 <= x,y <= 10000

T denotes the number of test cases. x denotes the x co-ordinate and y denotes the y co-ordinate.


Example:

Input:

2
0 10 10 0
5 5 15 0
0 2 1 1
-2 -3 0 2

Output:

1
0
 */
package GeeksForGeeksSchool;

import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class OverlappingRectangles {
     public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
           int x1=sc.nextInt();
           int y1=sc.nextInt();
           int x2=sc.nextInt();
           int y2=sc.nextInt();
           
           int x3=sc.nextInt();
           int y3=sc.nextInt();
           int x4=sc.nextInt();
           int y4=sc.nextInt();


        test--;}
    }
}
