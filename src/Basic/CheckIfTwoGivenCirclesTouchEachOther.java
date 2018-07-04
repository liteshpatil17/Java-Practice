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
public class CheckIfTwoGivenCirclesTouchEachOther {
        public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
            double c1x1=sc.nextDouble(); 
            double c1y1=sc.nextDouble();  
            double c2x2=sc.nextDouble();            
            double c2y2=sc.nextDouble();         
            double c1r1=sc.nextDouble();         
            double c1r2=sc.nextDouble();

            double dist=Math.sqrt(Math.pow((c2x2-c1x1),2)+Math.pow((c2y2-c1y1),2));
//            System.out.println(dist);
//                        System.out.println(c1r1+c1r2);
            if(dist<c1r1+c1r2)
                System.out.println(1);
            else
                System.out.println(0);

     test--;
        }
    }
        
}
