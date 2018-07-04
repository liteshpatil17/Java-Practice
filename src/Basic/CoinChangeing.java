/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this matlate file, choose Tools | Templates
 * and open the matlate in the editor.
 */
package Basic;

import java.util.Arrays;

/**
 *
 * @author Litesh
 */
public class CoinChangeing {
    public static void main(String args[])
    {
       int coins[]={1,2,3};
       int sum=5;
       System.out.println(noOfWaysToSum(coins,sum));
    }

    private static int  noOfWaysToSum(int[] coins, int sum) {
        int[][] mat=new int[coins.length+1][sum+1];
        for(int i=0;i<=coins.length;i++)
            mat[i][0]=1;
      
        for(int i=1; i <= coins.length; i++){
            for(int j=1; j <= sum ; j++){
                if(coins[i-1] > j){
                    mat[i][j] = mat[i-1][j];
                }
                else{
                    mat[i][j] = mat[i][j-coins[i-1]] + mat[i-1][j];
                }
            }
        }
         for(int i=0;i<=coins.length;i++)
         System.out.println(Arrays.toString(mat[i]));

        return mat[coins.length][sum];
    }
}
