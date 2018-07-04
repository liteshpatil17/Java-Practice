/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeksSchool;

import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class ReverseString {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test =sc.nextInt();
        while(test>0)
        {
            String str=sc.next();
            StringBuffer sb=new StringBuffer(str);
            sb=sb.reverse();
            System.out.println(sb.toString());
            sb.
            
        test--;}
    }
    
}
