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
public class SubsetSumProblem {
    public static void main(String args[])
    {
        int [] arr={2,3,2,8,10};
        int sum=11;
        System.out.println(" "+sumIsPresent(arr,sum));
    }

    private static boolean sumIsPresent(int[] arr, int sum) {
        boolean[][] mat=new boolean[arr.length+1][sum+1];
       
        for(int i=0;i<=arr.length;i++)
            mat[i][0]=true;
  
        for(int i=1;i<=arr.length;i++)
        {
            for(int j=1;j<=sum;j++)
            {
                if(j-arr[i-1]>=0)
                    mat[i][j] = mat[i-1][j-arr[i-1]] || mat[i-1][j];
                else 
                    mat[i][j]=mat[i-1][j];
                
                 
            }
        }
        for(int k=0;k<=arr.length;k++)
            System.out.println(Arrays.toString(mat[k]));
        
        return mat[arr.length-1][sum];
    }
}
