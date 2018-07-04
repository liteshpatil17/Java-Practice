//Pronic number is a number which is the product of two consecutive integers. The task is to check and print Pronic Numbers in a range. The first few Pronic numbers are:
//0, 2, 6, 12, 20, 30, 42, 56, 72, 90, 110, 132 and so on.
//
//Input:
//The first line consists of an integer T i.e number of test cases. The first and only line of each test case contains an integer n.
//
//Output:
//Print all the pronic numbers between 0 and n(with spaces in between).
//
//Constraints: 
//1<=T<=100
//1<=n<=1000
//
//Example:
//Input:
//2
//6
//56
//
//Output:
//0 2 6
//0 2 6 12 20 30 42 56

package GeeksForGeeksSchool;

import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class PronicNumber {
    public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            int test=sc.nextInt();
            for(int t=1;t<=test;t++)
                {
                int upto=sc.nextInt();
                int pronic=0;
                int j,i=1;
                if(upto!=0)
                    {
                    System.out.print(0+" ");
                    }
                while(pronic!=upto)
                {
                        j=i;
                        pronic=j*(++j);
                        System.out.print(pronic+" ");
                        i++;
                }
                System.out.println();

                }
        }
}
