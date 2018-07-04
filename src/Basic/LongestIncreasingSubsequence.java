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
public class LongestIncreasingSubsequence {

    
    public static void main(String args[])
   {
        LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
//        int arr[] = {23,10,22,5,33,8,9,21,50,41,60,80,99, 22,23,24,25,26,27};
        int arr[] = {3,4,-1,0,6,2,3};
        int result = lis.longestSubsequenceWithActualSolution(arr);
        System.out.println(result);
   }

    private int longestSubsequenceWithActualSolution(int[] arr)
    {
        int[] temp=new int[arr.length];
        Arrays.fill(temp,1);
        for(int i=1;i<arr.length;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(arr[j]<arr[i])
                    temp[i]=temp[j]+1;
            }
        }
        System.out.println(Arrays.toString(temp));
        Arrays.sort(temp);
        return temp[arr.length-1];
    }

    
}
