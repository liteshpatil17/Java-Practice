/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Litesh
 */
public class KnapsackProblem {
    public static void main(String args[])
    {
        int weight[]={1,3,4,5};
        int value[]={1,4,5,7};
        int size=7;
         int col=size+1;
        int row=weight.length+1;
        int mat[][]=new int[row][col];
        System.out.println(knapasckSol(weight,value,7,mat));
        
        for(int i=0;i<row;i++)
            System.out.println(Arrays.toString(mat[i]));
        
        int select[]=findWeightToInclude(weight,mat,size);
    }

    private static int  knapasckSol(int[] weight, int[] value, int size,int[][] mat) {
       
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
              if(i==0 || j==0)
              {
                  mat[i][j]=0;
                  continue;
              }
              
              if(j-weight[i-1]>=0)
              {
                  mat[i][j]=Math.max(mat[i-1][j] , value[i-1]+mat[i-1][j-weight[i-1]]);
              }else
                  mat[i][j]=mat[i-1][j];
            }
        }
        return mat[mat.length-1][size];  
        
    }

    private static int[] findWeightToInclude(int []weight,int[][] mat, int size) {
        int i=mat.length-1;
        int j=size;
        ArrayList<Integer> arrList=new ArrayList<Integer>();
        while(mat[i][j]!=0)
        {
            if(mat[i][j]==mat[i-1][j])
            {
                arrList.add(weight[i-2]);
                i=i-1;
                j=j-weight[i-2];
            }
            else if(mat[i][j]!=mat[i-1][j])
            {
                arrList.add(weight[i-2]);
                i=i-1;
                j=j-weight[i-2];
            }
        }
        System.out.print(arrList);
        return new int[]{1,2,3};
    }
}