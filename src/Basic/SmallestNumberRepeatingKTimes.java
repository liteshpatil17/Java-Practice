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
public class SmallestNumberRepeatingKTimes {
        public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
            int n=sc.nextInt();
            int r=sc.nextInt();
            int ele=-1;
            int arr[]=new int[n];
            
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }

            Arrays.sort(arr);

            outer:for(int i=0;i<arr.length;i++)
            {
                int count=0;
                for(int j=0;j<arr.length;j++)
                {
                    if(arr[i]==arr[j])
                        count++;
                    else 
                        continue;
                 
                }  
                   if(count==r)
                    {
                        ele=arr[i];
                        break outer;
                    }
            }
            
            if(ele==-1)
                System.out.println(-1);
            else
                System.out.println(ele);
        test--;}
    }
    
}
