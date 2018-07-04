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
public class MatrixChainMultiplication {
    public static void main(String ags[])
    {
        int mat[]=new int[]{1,2,3,4};
        System.out.println(MinCost(mat,mat.length));
    }

    private static int MinCost(int[] mat, int length) {
       int m[][]=new int[length][length];
       
       for(int i=0;i<length;i++)
        for(int j=0;j<length;j++)
           if(i==j)
               m[i][j]=0;
       
       for(int L=2;L<length;L++)
       {
           for(int i=1;i<=length-L;i++)
           {
               int j=i+L-1;
               m[i][j] = Integer.MAX_VALUE;
	     for(int k=i;k<=j-1;k++)
               {
                  int  q=m[i][k]+m[k+1][j]+mat[i-1]*mat[k]*mat[j];
                  if (q < m[i][j])
                      m[i][j] = q;
               }
           }
       }
       return m[1][length-1];   
    }
}
