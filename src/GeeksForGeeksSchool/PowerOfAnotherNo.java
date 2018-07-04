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
public class PowerOfAnotherNo {
       public static void main(String args[])
    {   
        int test;
        Scanner sc=new Scanner(System.in);
        test=sc.nextInt();
        for(int t=0;t<test;t++)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            int i=1,ans=0;
            while(ans<=y)
            {
              
              ans=(int)Math.pow((int)x, i);
              if(ans==y)
              {
                  break;
              }
              i++;
          
            }
           if(ans==y)    
               System.out.println(1);
           else
               System.out.println(0);

        }
    }
}
