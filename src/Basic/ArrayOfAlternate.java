/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

import java.util.*;

/**
 *
 * @author Litesh
 */
public class ArrayOfAlternate {
         public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        { 
            int len=sc.nextInt();
            ArrayList<Integer> pos=new ArrayList<Integer>();
            ArrayList<Integer> neg=new ArrayList<Integer>();
            ArrayList<Integer> alt=new ArrayList<Integer>();
            for(int i=0;i<len;i++)
            {
                int num=sc.nextInt();
                if(num>=0)
                    pos.add(num);
                else
                    neg.add(num);
            }
            int i=0;
            int j=0;

//               for(int k=0;k<pos.size();k++)
//                   System.out.print(pos.get(k));
//            
            while(i!=pos.size() || j!=neg.size())
            {  
                
                System.out.println(i+" +++"+j+"++"+pos.size() +" "+neg.size());

                if(i!=pos.size() && j!=neg.size()){
                alt.add(pos.get(i));
                alt.add(neg.get(j));}
               
                i++;j++;
            }
            System.out.println(alt);
            System.out.println(neg+" +++"+pos+"++"+pos.size());
        test--;}
    }
}
