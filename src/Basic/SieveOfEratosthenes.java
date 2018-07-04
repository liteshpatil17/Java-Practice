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
public class SieveOfEratosthenes {
    
    static void primeNo(int no)
    {
        boolean arr[]=new boolean[no+1];
        
        for(int i=0;i<no;i++)
            arr[i]=true;

              for(int p = 2; p*p <=no; p++)
        {
            // If prime[p] is not changed, then it is a prime
            if(arr[p] == true)
            {
                // Update all multiples of p
                for(int i = p*2; i <= no; i += p)
                    arr[i] = false;
            }
        }
        
        for(int i=2;i<=no;i++)
        {
            if(arr[i]==true)
                System.out.print(i+" ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        primeNo(n);
//        System.out.print("adadssa ");

    }
}
