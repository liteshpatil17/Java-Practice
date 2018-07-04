/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

import java.util.Stack;

/**
 *
 * @author Litesh
 */
public class MaxAreaOfHistogram {
    public static void main(String args[])
    {
        int hist[]={2,1,2,3,1};
        System.out.println(findMaxRectangularArea(hist,hist.length));
    }

    private static int findMaxRectangularArea(int[] hist, int length) {
        Stack<Integer> stack=new Stack<Integer>();
        int area=0,maxArea= -1;
        for(int i=0;i<length;)
        {
            if(stack.isEmpty() || stack.peek() <= hist[i])
                stack.push(i++);
            else
            {
                int top=stack.pop();
                if(stack.isEmpty())
                    area=hist[top]*i;
                else
                {
                    area=hist[top]*(i - stack.peek() - 1);
                }
                if(area>maxArea)
                    maxArea=area;
            }
        }
            
    return 0;}
}
