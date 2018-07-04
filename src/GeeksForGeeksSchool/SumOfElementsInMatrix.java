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
public class SumOfElementsInMatrix {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test;
        test=sc.nextInt();
        while(test>0){
            int n,m,sum=0;
            n=sc.nextInt();
            m=sc.nextInt();
            int a=n*m;
            while(a>0)
            {
                sum=sum+sc.nextInt();
            a--;
            }
            System.out.println(sum);
        test--;}
    }
}
