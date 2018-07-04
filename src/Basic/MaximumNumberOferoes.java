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
public class MaximumNumberOferoes {
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
            int len=sc.nextInt();
            int arr[]=new int[len];
            
            for(int i=0;i<len;i++)
                arr[i]=sc.nextInt();
            
            int copyArr[]=arr.clone();
            int zero[]=new int[len];
            
            for(int i=0;i<len;i++)
            {   
                int z=1;
                while(arr[i]%10==0)
                {
                    zero[i]=z++;
                    arr[i]=arr[i]/10;
                }
            }
            System.out.println(Arrays.toString(zero));
            int copyZero[]=zero.clone();
            Arrays.sort(copyZero);
            
             if(copyZero[len-1]!=0 && Arrays.binarySearch(zero, copyZero[len-1])!=-1)
             { int max=copyArr[Arrays.binarySearch(zero, copyZero[len-1])];
               System.out.println(max);
             }
            else
                System.out.println(-1);
                        
        test--;}
    }
}
