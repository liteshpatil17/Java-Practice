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
public class CeilTheFloor {
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            int num=sc.nextInt();
            int floor=0,ceil=0;
            for(int i=0;i<arr.length;i++)
                arr[i]=sc.nextInt();
            
            Arrays.sort(arr);
//            System.out.println(Arrays.toString(arr));

            for(int i=0;i<arr.length;i++)
            {
                ceil=i;
                if(arr[i]>num)
                    break;
            }
             
           
            if(arr[0]>num)
                System.out.println("Floor doesn't exist");
            else
                    System.out.println(arr[ceil-1]);
            
           if(arr[n-1]<num)
                System.out.println("Ceil doesn't exist");
           else
                System.out.println(+arr[ceil]);
 
            test--;}
    }
}
