/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class FindingProfession {
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {  
            int level=sc.nextInt();
            int no=sc.nextInt();
            
            char arr[]=new char[(int)Math.pow(2, level)];
              
            arr[0]='E';
            for(int i=0;(i*2+2)<arr.length;i++)
            {
                 if(arr[i]=='E')
                 {
                     arr[i*2+1]='E';
                     arr[i*2+2]='D';
                 }
                else if(arr[i]=='D')
                {
                    arr[i*2+1]='D';
                    arr[i*2+2]='E';
                }
                     
            }
            
       
//            System.out.println(Arrays.toString(arr));
            if(arr[((int)Math.pow(2, level-1)-2)+no]=='E')
               System.out.println("Engineer");
            else
                System.out.println("Doctor");
        test--;}
    }
}
