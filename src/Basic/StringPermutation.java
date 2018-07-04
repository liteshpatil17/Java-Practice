/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Litesh
 */
public class StringPermutation {
    
    
    private void strPermutation(char[] input) {
    Map<Character,Integer> countMap=new TreeMap<Character,Integer>(); 
    for(char ch:input)
    {
        countMap.compute(ch, (key,val)->
            {
                if(val==null)
                     return 1;
                else
                    return val+1;
            });
    }
        char str[]=new char[countMap.size()];
        int count[]=new int[countMap.size()];
        int index=0; 
        for(Map.Entry<Character,Integer> entry: countMap.entrySet())
         {
             str[index]=entry.getKey();
             count[index]=entry.getValue();
             index++;
         }
    char output[]=new char[input.length];
    System.out.println(Arrays.toString(str));
    System.out.println(Arrays.toString(count));
    strPermutationUtil(str,count,output,0);
    }
    
    private void strPermutationUtil(char[] str,int[] count,char []output,int level)
    {
        printStr(output,level);
        if(level==output.length)
        {return;}
        for(int i=level;i<str.length;i++)
        {
            if(count[i]==0)
                continue;
            output[level]=str[i];
            count[i]--;
            strPermutationUtil(str,count,output,level+1);
            count[i]++;
        }
    }
    
    private void printStr(char[] str,int len)
    {
        for(int i=0;i<len;i++)
            System.out.print(str[i]);
        System.out.println();
    }
    
    public static void main(String args[])
    {
        StringPermutation strp=new StringPermutation();
        String string="ABC";
        strp.strPermutation(string.toCharArray());
    }

}
