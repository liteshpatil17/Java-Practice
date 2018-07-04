/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Litesh
 */
public class MinimumNumberOfFliippedBits {
    
    static char expected(char ch)
    {
        return (ch=='0')?'1':'0';
    }

    static int FlipsStartingWith(String str,char exp)
    {
        int flip=0;
        for(int i=0;i<str.length();i++)
         {
             if(str.charAt(i)!=exp)
                 flip++;
             exp=expected(exp);
         }
        return flip;
    }
    
    static int MinBitsToFlip(String str)
    {
        return Math.min(FlipsStartingWith(str,'0'),FlipsStartingWith(str,'1'));
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
            String binStr=sc.next();
            System.out.println(MinBitsToFlip(binStr));
        test--;}
    }
}
