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
public class SegmentedTree {
    public static void main(String args[])
    {
        int n=6;
        int input[]=new int[]{-1,2,4,0};
        int seg[]=new int[7];
        constructSegTree(input,seg,0,3,0);
        System.out.println(Arrays.toString(seg));
        System.out.println("Min of  [1,3] = "+searchQuery(seg,0,3,1,3,0));
    }

    private static void constructSegTree(int[] input, int[] seg, int low, int high, int pos) {
       if(low==high)
       {seg[pos]=input[low];return;}
       int mid=(low+high)/2;
       constructSegTree(input,seg,low,mid,pos*2+1);
       constructSegTree(input,seg,mid+1,high,pos*2+2);
       seg[pos]=Math.min(seg[pos*2+1],seg[pos*2+2]);
    }
    
        private static int searchQuery(int []seg,int low,int high,int qLow,int qHigh,int pos)
        {
          if(qLow <= low && qHigh >= high)
            return seg[pos];
        
            if(qLow > high || qHigh < low)
                return Integer.MAX_VALUE;
            int mid=(low+high)/2;
            return Math.min(searchQuery(seg,low,mid,qLow,qHigh,2*pos+1),
                            searchQuery(seg,mid+1,high,qLow,qHigh,2*pos+2));
        }
      
}
