/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Litesh
 */
public class NumbersHavingTwoAdjacentSetBits {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
            String num=sc.next();
            BigInteger numBig=new BigInteger(num);
            String str=numBig.toString(2);
            
            String pat="^.*11.*$";
                System.out.println(str);

            if(Pattern.matches(pat,str))
                System.out.println("Yes");
            else
                System.out.println("No");
        test--;}
        
    }
}
