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
public class KeyPair {

    static boolean findSum(int []arr,int x)
    {
        Arrays.sort(arr);
        int l=0;
        int r=arr.length-1;
        while(l<r)
        {
            if(arr[r]+arr[l]==x)
                return true;
            if(arr[r]+arr[l]>x)
                r--;
            else
                l++;
        }
        return false;
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        { 
            int len=sc.nextInt();
            int x=sc.nextInt();
            int arr[]=new int[len];
            for(int i=0;i<len;i++)
                arr[i]=sc.nextInt();
            boolean find=findSum(arr,x);
            if(find==true)
                System.out.println("Yes");
            else     
                 System.out.println("No");
        test--;}
    }
}
