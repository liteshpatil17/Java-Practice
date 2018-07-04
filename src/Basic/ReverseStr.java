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
public class ReverseStr {
    
    static void reverse(char []arr,int start ,int end)
    {
        if(start>end)
            return;
        char temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        reverse(arr,start+1,end-1);
        
    }
    static void printArr(char arr[])
    {
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]);
    }
          public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        { 
            String str=sc.next();
            char []arr=str.toCharArray();
            reverse(arr,0,arr.length-1);
            printArr(arr);
            System.out.println();
        test--;}
    }
}