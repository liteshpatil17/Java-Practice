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
public class MinCostPath {
    public static void main(String args[])
    {
        int arr[][]={
            {1,3,5,8},
            {4,2,1,7},
            {4,3,2,3}};
    System.out.println(minCostPath(arr));
    }

    private static int minCostPath(int[][] arr) {
    int cost[][]=new int[arr.length][arr[0].length];
    cost[0][0]=arr[0][0];
    for(int i=1;i<cost[0].length;i++)
        cost[0][i]=cost[0][i-1] + arr[0][i];           
    for(int i=1;i<cost.length;i++)
        cost[i][0]=cost[i-1][0] + arr[i][0];           
    
    for(int i=1;i<cost.length;i++)
    {
        for(int j=1;j<cost[0].length;j++)
        {
            cost[i][j]=Math.min(cost[i][j-1],cost[i-1][j])+arr[i][j];
        }
    }
    
    for(int i=0;i<cost.length;i++)
        System.out.println(Arrays.toString(cost[i]));
    return cost[arr.length-1][arr[0].length-1];
    }
}
