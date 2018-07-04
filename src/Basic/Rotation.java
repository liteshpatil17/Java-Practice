/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class Rotation {
    static int findRot(int arr[])
    {
        int min=arr[0];int minindex= -1;
        for(int i=0;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
                minindex=i;
            }
        }
        return minindex;
    }
   
    
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
            
            int rotNo=findRot(arr);
        test--;}
    }
}
