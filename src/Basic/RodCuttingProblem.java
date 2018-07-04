/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Litesh
 */
public class RodCuttingProblem {
    public static void main(String args[])
    {
       TreeMap<Integer,Integer> rods=new TreeMap<Integer,Integer>();
       rods.put(1,2);
       rods.put(2,5);
       rods.put(3,7);
       rods.put(4,8);
       System.out.println(rodCuttingSol(rods));
       
    }

    private static int rodCuttingSol(TreeMap<Integer, Integer> rods) {
        int mat[][]=new int[rods.size()][rods.size()+1];
        for(int i=0;i<rods.size();i++)
            mat[i][0]=0;
        
//        Comparator<Entry<Integer,Integer>> sortedBySIze=new Comparator<Entry<Integer,Integer>>(){
//            @Override
//            public int compare(Entry<Integer, Integer> r1, Entry<Integer, Integer> r2) {
//             Integer a=r1.getKey();
//             Integer b=r2.getKey();
//             return a.compareTo(b);
//            }
//        };
//        
        Set<Integer>keys=rods.keySet();
        for(int i=0;i<rods.size();i++)
        {
            for(int j=1;j<=rods.size();j++)
            {
                if(j==rods.get(keys.))
            }
        }
        return 0;
    }
}
