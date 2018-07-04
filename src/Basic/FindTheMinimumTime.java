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
public class FindTheMinimumTime {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        int n=sc.nextInt();
        
        if(s1>s2)
        {
            int temp=s2;
            s2=s1;
            s1=temp;
        }
        
        int result=1000000000;
        for(int i=1;i<=n;i++)
        {
            result=Math.min(result,Math.max(s1*i,s2*(n-i)));
        }
            
        System.out.println(result);
        test--;}
    }
}
