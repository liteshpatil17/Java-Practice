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
public class RotationOfArrayEffi {
      public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        { 
            int len=sc.nextInt();
            int temp[]=new int[len*2];
            int rot=sc.nextInt();
            for(int i=0,j=(len*2)/2;i<len && j<len*2;i++,j++)
            {
              temp[i]=sc.nextInt();  
              temp[j]=temp[i];  
            }
            int StIndex=rot%len;
            int EndIndex=StIndex+len;
            for(int i=StIndex;i<=EndIndex;i++)
                System.out.print(temp[i]+" ");
            System.out.println();
                
        
    test--;}
    }
}
