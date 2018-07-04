/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeksSchool;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class ReverseDigit {
    static BigInteger reverse(BigInteger n)
    {
        BigInteger ans=new BigInteger("0");
        if(n.equals(new BigInteger("0")))
           return ans; 
        else{
            ans=reverse(n.mod(new BigInteger("10")));
        }
        
    }
    
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
           String str=sc.next();
            BigInteger n=new BigInteger(str);
            reverse(n);
        test--;}
    }
}
