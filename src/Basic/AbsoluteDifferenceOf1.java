/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class AbsoluteDifferenceOf1 {
    
//    static int absDiff(int num)
//    {
//      int temp=0;
//      int diff,absDiff;
//      int last=num%10;
//      num=num/10;
//        while(num!=0)
//        {
//            
//            last=num%10;
//            diff=Math.abs(temp-last);
//            num/=10;
//            System.out.println(diff);
//            absDiff=diff;
//        }
//        
//    return absDiff;
//    }
//    
    public static void main(String args[])
    {
       outer: for(int i=0;i<10;i++)
         {
            for(int j=0;j<10;j++)
            {
                if(j>i)
                {  
                    System.out.println();
                    continue outer;
                }
                System.out.print(" "+i*j);

            }
            
        }
//        Scanner sc=new Scanner(System.in);
//        int test=sc.nextInt();
//        while(test>0)
//        {
//            int n=sc.nextInt();
//            int k=sc.nextInt();
//            int arr[]=new int[n];
//            
//            for(int i=0;i<=n-1;i++)
//            {
//                
//            }
//            test--;}
    }
}
