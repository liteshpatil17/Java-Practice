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
public class MinJumpToReachEnd {
 public static void main(String args[])
 {
     int arr[]={2,3,1,1,2,4,2,0,1,1};
     System.out.println(minJumpTake(arr,arr.length));
 }

    private static int minJumpTake(int[] arr, int length) {
        int jump[]=new int[length];
        Arrays.fill(jump,10);
//        System.out.println(Arrays.toString(jump));
        jump[0]=0;
        for(int i=1;i<length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(i<=arr[j]+j)
                {
                    jump[i]=Math.min(jump[i],jump[j]+1);
                }
            }
        }
        System.out.println(Arrays.toString(jump));
    return 0;
    }
}
