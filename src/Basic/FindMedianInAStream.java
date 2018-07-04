/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class FindMedianInAStream {
     
    static int Median(ArrayList<Integer> al)
    {
        int median=0;
        if(al.size()%2==0)
            median=(al.get(((int)Math.floor(al.size()/2))-1) + al.get((int)Math.floor(al.size()/2)))/2;
        else
            median=al.get(Math.floorDiv(al.size(), 2));
        
        return median;
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
//        int test=sc.nextInt();
//        while(test>0)
//        {
            int len=sc.nextInt();
            ArrayList<Integer> al=new ArrayList<Integer>();
            for(int i=0;i<len;i++)
            {
                al.add(sc.nextInt());
                Collections.sort(al, new Comparator<Integer>()
                    {
                        public int compare(Integer o1,Integer o2)
                        {return o1.compareTo(o2);
                        }
                    });
                System.out.println(Median(al));
                
            }
//        test--;}
    }
}
