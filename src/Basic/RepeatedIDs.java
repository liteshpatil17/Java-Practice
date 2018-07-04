package Basic;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Litesh
 */
public class RepeatedIDs {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
           int n=sc.nextInt();
           Vector<Integer> a=new Vector<Integer>();
           
           for(int i=0;i<n;i++)
           {
               a.add((Integer)sc.nextInt());
           }
           
           LinkedHashSet<Integer> set =new LinkedHashSet<Integer>();
           
           set.addAll(a);
           
           for(Object j:set)
            System.out.print(j+" ");
           
           System.out.println();
           
        test--;}
    }
}
