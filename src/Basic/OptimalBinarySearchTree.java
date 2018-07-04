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
public class OptimalBinarySearchTree {
    public static void main(String args[])
    {
        int[] arr={10,12,20,35,46};
        int[] fre={34,8,50,21,16};
        
        System.out.println(minCost(arr,fre));
    }

    private static int minCost(int[] arr, int[] fre) {
        int mat[][]=new int[arr.length][arr.length];
        
        for(int i=0;i<arr.length;i++)
            mat[i][i]=fre[i];
        
        for(int L=2;L<=arr.length;L++)
        {
            for(int i=0;i<=arr.length-L;i++)
            {
                int j=i+L-1;
                mat[i][j]=Integer.MAX_VALUE;
                int sum=sumOfFre(i,j,fre);
                int q=0;
                for(int k=i;k<=j;k++)
                {
                    q= sum + (i>k-1 ? 0 : (mat[i][k-1])) + ( k+1 > j ? 0 : (mat[k+1][j])) ;
                    if(q < mat[i][j])
                        mat[i][j]=q;
                }
            }
        }
        
        return mat[0][arr.length-1];
    }

    static int sumOfFre(int i,int j,int[] fre)
    {
        int sum=0;
        for(int s=i;s<=j;s++)
            sum=+fre[s];
        return sum;
    }


}

