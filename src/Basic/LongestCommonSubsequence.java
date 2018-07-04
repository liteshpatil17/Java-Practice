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
public class LongestCommonSubsequence {
    public static void main(String args[])
    {
        String str1="abcdaf";
        String str2="acbcf";
        char []seq1=str1.toCharArray();
        char []seq2=str2.toCharArray();
        int mat[][]=new int[seq1.length+1][seq2.length+1];
        lengthOfLongestSubSequence(mat,seq1,seq2);
        for (int[] mat1 : mat) {
            System.out.println(Arrays.toString(mat1));
        }
        System.out.println(mat[seq1.length][seq2.length]);
    }

    private static void lengthOfLongestSubSequence(int[][] mat, char[] seq1, char[] seq2) {
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(i==0 || j==0 )
                    mat[i][j]=0;
                else if(seq1[i-1]==seq2[j-1])
                    mat[i][j]=mat[i-1][j-1]+1;
                else
                    mat[i][j]=Math.max(mat[i-1][j],mat[i][j-1]);
            }
        }
    }
}
