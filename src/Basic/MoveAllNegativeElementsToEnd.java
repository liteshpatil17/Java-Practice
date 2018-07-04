package Basic;


import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Litesh
 */
public class MoveAllNegativeElementsToEnd {
    
    public static  int [] MoveNeg(int []arr)
    {
        int temp[]=new int[arr.length];
        int j=0;
        
        for(int i=0;i<arr.length;i++)
        {if(arr[i]>=0)
            temp[j++]=arr[i];
            }
        if(j==arr.length || j==0)
            return arr;
        for(int i=0;i<arr.length;i++)
        {if(arr[i]<0)
            temp[j++]=arr[i];
        }
        
        arr=temp.clone();
        return arr;
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
            
           arr= MoveNeg(arr);
           for(int i=0;i<len;i++) 
               System.out.print(arr[i]+" ");
         test--;}
    }
}
