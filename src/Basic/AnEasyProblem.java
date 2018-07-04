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
public class AnEasyProblem {
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        { 
            int K=sc.nextInt();
            int l=sc.nextInt();
            int r=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int a=-1;
            for(int i=l;i<=r;i++)
                for(int j=x;j<=y;j++)
                {
                    if(i/j==K)
                    {
                        a=1;
                        break;
                    }
                }
             if(a==1)
                 System.out.println("YES");
             else
                 System.out.println("NO");
            
        test--;}
    }
}
