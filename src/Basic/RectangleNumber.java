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
public class RectangleNumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test;
        test=sc.nextInt();
        
        while(test>0)
        {
            int n,m,noOfRect;
            n=sc.nextInt();
            m=sc.nextInt();
            noOfRect=(n*(n+1)*m*(m+1))/4;
            System.out.println(noOfRect);
        test--;}
    }
    
}
