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
public class CoinChangingMinimumCoins {
public static void main(String args[])
{
    int []coins={7,2,3,6};
    int sum=13;
    System.out.println(MinimumCoins(coins,sum));
    
}

    private static int MinimumCoins(int[] coins, int sum) {
        int []coinsReq=new int[sum+1];
        int []currentCoin=new int[sum+1];
        Arrays.fill(coinsReq,100000);
        Arrays.fill(currentCoin,-1);
        coinsReq[0]=0;
        currentCoin[0]=-1;
         
        for(int i=0;i<coins.length;i++)
        {
            int coin=coins[i];
            for(int j=1;j<sum+1;j++)
            { 
              if(j>=coin)
              { 
                if(coinsReq[j] > 1+coinsReq[j-coin])
                {
                    coinsReq[j]=1+coinsReq[j-coin];
                    currentCoin[j]=i;
                }
              }  
            }
        }
        System.out.print(Arrays.toString(coinsReq));
     return coinsReq[sum];
    }
}
