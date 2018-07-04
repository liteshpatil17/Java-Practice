/*
 * 21.Buy_Sell Stock With K transactions To Maximize Profit Dynamic Programming
 */
package Basic;

import java.util.Arrays;

/**
 *
 * @author Litesh
 */
public class BuySellStock {
    public static void main(String args[])
    {
       int stockPrice[]={2,5,7,1,4,3,1,3};
       int transaction=3;
       int days=stockPrice.length;
       System.out.println(MaxProfit(stockPrice,transaction,days));
    }

    private static int MaxProfit(int[] stockPrice, int transaction, int days) {
        int mat[][]=new int[transaction+1][days];
        for(int i=0;i<=transaction;i++)
            mat[i][0]=0;
        
        for(int i=0;i<days;i++)
            mat[0][i]=0;
        
        for(int i=1;i<=transaction;i++)
        {
            for(int j=1;j<days;j++)
            {
                for(int m=0;m<j;m++)
                {
                    int profit=(stockPrice[j]-stockPrice[m])+mat[i-1][m];
                    mat[i][j]=Math.max(mat[i][j],Math.max(mat[i][j-1],profit));
                }
            }
        }
        
         for(int i=0;i<mat.length;i++)
             System.out.println(Arrays.toString(mat[i]));
        
         return mat[transaction][days-1];
    }
}
