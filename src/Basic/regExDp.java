/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

import java.util.Arrays;

/**
 *
 * @author Litesh
 */
public class regExDp {
 public static void main(String args[])
 {
     String str="xaabyc";
     String regEx="xa*b.a";
     System.out.println(findMatch(regEx.toCharArray(),str.toCharArray()));
 }

    private static boolean findMatch(char[] regEx, char[] str) {
        boolean temp[][]=new boolean[str.length+1][regEx.length+1];
        temp[0][0]=true;
        for(int i=1;i<temp.length;i++)
        {
            for(int j=1;j<temp[0].length;j++)
            {
                if(regEx[i-1]==str[j-1] || regEx[i-1]=='.')
                    temp[i][j]=temp[i-1][j-1];
                else if(regEx[i-1]=='*')
                {   
                    temp[i][j]=temp[i][j-2];
                    if(regEx[j-2]==str[i-1] || regEx[j-2]=='.')
                        temp[i][j]= temp[i][j] | temp[i-1][j];
                }
                else  
                    temp[i][j]=false;
            }
        }
        for(int i=0;i<temp.length;i++)
            System.out.println(Arrays.toString(temp[i]));
    return true;
    }
}
