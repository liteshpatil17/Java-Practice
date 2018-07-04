/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class MaximumVolumeOfRectangularBox {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {   
        double P=sc.nextDouble();
        double S=sc.nextDouble();
//        obtain equation by substituting lb value from Surface area of cuboid 
//        to Volumne(l*b*h=v) and then substituting (l+b) from parameter eq.
//         V= s/2 *h - h*h(p/4) + h*h*h  diff it for h to find max
//        we get quadratic eq in h finding h1 and h2 after that solve for v1 and v2
//        
        double h1=((P/2)+Math.sqrt(Math.pow(-P/2, 2)-(4*3*(S/2))))/(2*3);
        double h2=((P/2)-Math.sqrt(Math.pow(-P/2, 2)-(4*3*(S/2))))/(2*3);
        double v1=((S/2)*h1)-((P/4)*Math.pow(h1, 2))+(Math.pow(h1, 3));
        double v2=((S/2)*h2)-((P/4)*Math.pow(h2, 2))+(Math.pow(h2, 3));
        
        DecimalFormat df = new DecimalFormat("#.##");      
        v1 = Double.valueOf(df.format(v1));
        v2 = Double.valueOf(df.format(v2));

        if(v1>v2)
            System.out.println(v1);
        else
            System.out.println(v2);


        
        test--;}
    }
}
