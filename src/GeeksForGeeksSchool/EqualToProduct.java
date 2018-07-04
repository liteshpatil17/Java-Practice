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
public class EqualToProduct 
{
     public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
            int i,found=-1,size,product,a[];
            size=sc.nextInt();
            product=sc.nextInt();
            a=new int[size];
            
            for(i=0;i<size;i++)
            {
                a[i]=sc.nextInt();
            }
            
            for(int j=0;j<size;j++)
            {
                for(int k=0;k<size;k++)
                {
                    if(a[j]*a[k]==product)
                    {
                        found=1;
                        break;
                    }
                }
            }
            
            if(found==1)
                System.out.println("Yes");
            else
                System.out.println("No");
        test--;}}
    
}
