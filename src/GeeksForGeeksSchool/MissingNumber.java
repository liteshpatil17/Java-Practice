/*
 * Vaibhav likes to play with numbers and he has n numbers. One day he was placing the numbers on the playing board just to count that how many numbers he have. He was placing the numbers in increasing order i.e. from 1 to n. But when he was putting the numbers back into his bag, some numbers fell down onto the floor. He picked up all the numbers but one number, he couldn't find. Now he have to go somewhere urgently, so he asks you to find the missing number.

Input:
The first of input contains an integer T, then T test cases follow. Each test case contains an integer n i.e. numbers of integers he placed on the board and the second line of each test case contains the array a[] which represents the numbers, he successfully picked up from the floor. 


Output:
For each test case in a new line print the missing number.


Constraints:
1<=T<=25
1<=n<=10000
1<=a[i]<=10000


Example:
Input:                    
2                                        
4                                        
1 4 3                           
5
2 5 3 1
Output:
2
4


Explanation:
For first test case
Vaibhav placed 4 integers but he picked up only 3 numbers. So missing number will be 2 as it will become 1,2,3,4.

For the second case
Vaibhav placed 5 integers on the board, but picked up only 4 integers, so the missing number will be 4 so that it will become 1,2,3,4,5.
 */
package GeeksForGeeksSchool;

import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class MissingNumber {
     public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int test,Partialsum=0,sum=0,MissingNo=0;
        test=scan.nextInt();
        while(test>0)
        {
         int i=0, totalNo=scan.nextInt();
         while(i!=totalNo-1)
         {
             Partialsum=Partialsum+scan.nextInt();
         i++;}
         
         sum=((totalNo)*(totalNo+1))/2;
         MissingNo=sum-Partialsum;
         System.out.println( Math.abs(MissingNo));    
        test--;}
    }
    
}
