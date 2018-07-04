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
public class FindUniquePairInAnArrayWithPairsOfNumbers {
   public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        { 
        int n=sc.nextInt();
        int arr[]=new int[n];
        int ans[]=new int[2];
        int t=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {     
            int count=0;
            for(int j=0;j<n;j++)
            {         
               if(arr[i]==arr[j])
                   count++;
                if(count==2)
                   break;
            }
            if(count==1)
            {
             ans[t]=arr[i];
             t++;
            }
        }
            Arrays.sort(ans);
            System.out.println(ans[0]+" "+ans[1]);

        test--;}
        
    }
}
