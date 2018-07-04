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
public class BalancingPan {
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        for(int t=0;t<test;t++)
        {
            int Ttemp=sc.nextInt();
            int atemp=sc.nextInt();
            int T=Integer.max(atemp, Ttemp);
            int a=Integer.min(atemp, Ttemp);
            String str=Integer.toString(T,a);
            System.out.print(str);

//            int i=0;
//            while(T!=Math.pow(a, i))
//            {
//                
//                   System.out.println("T is "+T);
//                    T=T+(int)Math.pow(a, i);
//                    if(T==(int)Math.pow(a, i))
//                        break;
//                    else if((int)Math.pow(a, i)>T)
//                        break;
//                    i++;
//
//            }
////            System.out.println((int)Math.pow(a, i));
////            System.out.println(T);
//
//            if(T==(int)Math.pow(a, i))
//                System.out.println("YES");
//            else
//                System.out.println("NO");

        
        }
    }
}
