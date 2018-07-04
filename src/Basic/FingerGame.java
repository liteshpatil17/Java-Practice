/*
 * Count the given numbers on your fingers and find the correct finger on which the number ends.

The first number starts from the thumb, second on the index finger, third on the middle finger, fourth on the ring finger and fifth on the little finger.
Again six comes on the ring finger and so on.

Input:
First line consists of T test cases. Only line input, one integer N.

Output:
Single line output, print the number of finger.

Constraints:
1<=T<=5000
1<=N<=5000

Example:
Input:
2
1
2
Output:
1
2
 */
package Basic;

import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class FingerGame {
      public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
            int n=sc.nextByte();
            int fing=n%8,fingNo=0;
            if(fing==1)
               fingNo=1;
            else if(fing==2 || fing==0)
               fingNo=2;
            else if(fing==3 || fing==7)
               fingNo=3;
            else if(fing==4 || fing==6)
               fingNo=4;
            else if(fing==5)
               fingNo=5;
            
            System.out.println(fingNo);
            test--;
        }
    }
}
