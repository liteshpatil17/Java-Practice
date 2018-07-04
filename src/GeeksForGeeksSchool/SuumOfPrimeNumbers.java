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
public class SuumOfPrimeNumbers {
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test;
        
        test=sc.nextInt();
        while(test>0)
        {
            int num,i,j,k;
            num=sc.nextInt();
            int primeSum=0;
            for(i=1;i<=num;i++)
            {
              
              int count=0;
            
              for(j=i;j>=1;j--)  
              {
                if(i%2!=0)
                  break;
                 
                  if(i%j==0)
                {
                    count=count+1;

                }
        
              }
              if(count==2)
                {
                      System.out.println(i);
                      primeSum=primeSum+i;
                }
              
            }
              
            
            //System.out.println(primeSum);

            test--;
         }
            
            
    }
    }
    

