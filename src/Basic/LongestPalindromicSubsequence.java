/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

/**
 *
 * @author Litesh
 */
public class LongestPalindromicSubsequence {
    public static void main(String args[])
    {
        String str="agbdba";
        char[] arr=str.toCharArray();
        System.out.println(longestPalindromLength(arr,arr.length));
    }

    private static int longestPalindromLength(char[] arr, int length) {
        int mat[][]=new int[length][length];
        for(int i=0;i<length;i++)
            mat[i][i]=1;
        for(int L=2;L<=length;L++)
        {
            for(int i=0;i<=length-L;i++)
            {
                int j=i+L-1;
                if(L == 2 && arr[i] == arr[j])
                    mat[i][j] = 2;
                else if(arr[i]==arr[j])
                    mat[i][j]=2+mat[i+1][j-1];
                else
                    mat[i][j]=Math.max(mat[i][j-1],mat[i+1][j]);
            }
        }
    return mat[0][length-1];}
}
