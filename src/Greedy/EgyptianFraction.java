/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Greedy;

/**
 *
 * @author Litesh
 */
public class EgyptianFraction {
    
     public static void EgyFrac(int num,int den)
     {
         if(num==0 || den==0)
             return;
         if(num%den==0)
             System.out.println("1/"+(den/num));
         if(den%num==0)
             System.out.println((num/den));
         if(den>num)
         {
             
         }
     }

    public static void main(String args[])
    {
      int num=12;
      int den=13;
      
      EgyFrac(num,den);
              }
}
