/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class BinaryRepresentationOfPreviousNumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
          String bno=sc.next();
          String minusOne="-1";
          BigInteger n=new BigInteger(bno, 2);
          BigInteger MinusOne=new BigInteger(minusOne,10);
          BigInteger preNo=n.add(MinusOne);
          System.out.println(preNo.toString(2));
          

        test--;}
    
    }
    
}
