/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

import java.util.Arrays;
import java.util.Stack;

/**
 *
 * @author Litesh
 */
public class MaxSizeRectInMatrix {
    public static void main(String args[])
    {
//        int hist[]={2,1,2,3,1};
//        System.out.println(maxRectHistogram(hist));
        
        int arr[][]={
            {1,0,0,1,1,1},
            {1,0,1,1,1,1},
            {0,1,1,1,1,1},
            {0,0,1,1,1,1}};
        
        System.out.println(findMaxRectMatrix(arr));
    }

    private static int findMaxRectMatrix(int[][] arr) {
            int temp[]=new int[arr[0].length];
            int area=0,maxArea= -1;
            Arrays.fill(temp,0);
            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<temp.length;j++)
                {
                    if(arr[i][j]!=0)
                        temp[j]=temp[j]+arr[i][j];
                    else
                        temp[j]=0;
                }
                area=maxRectHistogram(temp);
                if(maxArea<area)
                    maxArea=area;
        
            }
    return maxArea;
    }

    private static int maxRectHistogram(int[] temp) {
        Stack<Integer> st=new Stack<Integer>(); 
        int area=0,maxArea=-1,i;
        for(i=0;i<temp.length;)
        {
            if(st.isEmpty() || temp[st.peek()]<=temp[i])
            {
                st.push(i++);
            }else
            {
                int top=st.pop();
                if(st.isEmpty())
                    area=temp[top]*(i);
                else
                    area=temp[top]*(i-st.peek()-1);
            if(maxArea<area)
                maxArea=area;
            }
        }
        
        while(!st.isEmpty())
        {
                int top=st.pop();
                if(st.isEmpty())
                    area=temp[top]*(i);
                else
                    area=temp[top]*(i-st.peek()-1);
            if(maxArea<area)
                maxArea=area;
        
        }
    return maxArea;
    }
        
    }

