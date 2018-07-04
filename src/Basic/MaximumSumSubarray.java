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
public class MaximumSumSubarray {
    public static void main(String args[])
    {
        int[] arr={4,-3,-2,2,3,1,-2,-3,4,2,-6,-3,-1,3,1,2};
        System.out.println(MaxSumSubarray(arr,arr.length));
        
    }

    private static int  MaxSumSubarray(int[] arr, int length) {
        int maxSum=arr[0];
        int max_till_now=0;
        int s=0,start=0,end=0;
        for(int i=0;i<length;i++)
        {
            max_till_now=max_till_now + arr[i];
            if(max_till_now>maxSum)
            {   
                maxSum=max_till_now;
                start=s;
                end=i;
            }
            if(max_till_now<0)
            { 
                max_till_now=0;
                s=i;
            }
            
        }
        System.out.println(start+" "+end);
    return maxSum;
    }
}
