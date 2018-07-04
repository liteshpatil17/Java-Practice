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
public class MinimumEditDistance {
 public static void main(String args[])
 {
    String s1="abcdef"; 
    String s2="azced";
    char []str1=s1.toCharArray();
    char []str2=s2.toCharArray();
    System.out.println(minimumDistance(str1,str2,str1.length,str2.length));
 }

    private static int minimumDistance(char[] str1, char[] str2, int length1, int length2) {
        int[][] mat=new int[length2+1][length1+1];
        for(int i=0;i<length2+1;i++)
            mat[i][0]=i;
        for(int i=0;i<length1+1;i++)
            mat[0][i]=i;
        
       
        for(int i=1;i<=length2;i++)
        {
            for(int j=1;j<=length1;j++)
            {
                if(str2[i-1]==str1[j-1])
                    mat[i][j]=mat[i-1][j-1];
                else
                    mat[i][j]=Math.min(Math.min(mat[i-1][j-1], mat[i-1][j]),mat[i][j-1])+1;
            }
        }
         for(int j=0;j<=length2;j++)
            System.out.println(Arrays.toString(mat[j])); 
    return mat[length2][length1];
    }
}
