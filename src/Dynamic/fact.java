/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dynamic;

/**
 *
 * @author Litesh
 */
public class fact {
    static int factorial(int n)
    {
        int fact[]=new int[n+1];
        fact[0]=1;
        fact[1]=1;
        for(int i=2;i<=n;i++)
            fact[i]=n*factorial(n-1);
        return fact[n];
    }
    public static void main(String args[])
    {
        int n=5;
        int ans=factorial(n);
        System.out.println(ans);
    }
}
