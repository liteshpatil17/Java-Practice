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
public class MaximumSumRectangle {
    int currUp=0,currDown=0;
    int maxUp=0,maxDown=0,maxLeft
    public static void main(String args[])
    {
        int[][] mat={{2,1,-3,4,5},
                     {0,6,3,4,1},
                     {2,-2,-1,4,-5}, 
                     {-3,3,1,0,3}};
        System.out.println(maxSumRect(mat));
    }

    private static boolean maxSumRect(int[][] mat) {
        
    }
    
    
     private static int  MaxSumSubarray(int[] arr, int length) {
        int maxSum=arr[0];
        int max_till_now=0;
        int s=0;
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
