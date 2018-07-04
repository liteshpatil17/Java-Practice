/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Greedy;

/**
 *
 * @author Litesh
 */
public class ActivitySelectionProblem {
    
    static void printMaxActivities(int []s, int []f, int n)
    {
        int i=0;
        System.out.print(i+" ");
        
        for(int j=1;j<n;j++)
        {
            if(s[j]>=f[i])
            {
                System.out.print(j+" ");
                i=j;
            }
        }
    }
    public static void main(String args[])
    {
    int s[] =  {1, 3, 0, 5, 8, 5};
    int f[] =  {2, 4, 6, 7, 9, 9};
    int n = s.length;
        
    printMaxActivities(s, f, n);
    }
}
