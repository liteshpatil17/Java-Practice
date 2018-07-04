/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Litesh
 */
 class Job
 {
     int start;
     int end;
     int profit;
     Job(int s,int e,int p)
     {
         start=s;end=e;profit=p;
     }
 }

class jobComparator implements Comparator<Job>{
    @Override
    public int compare(Job j1, Job j2) {
        return j1.end - j2.end ;
    }
}
public class JobSchedulingProblem {
    
public static void main(String args[])
{
    ArrayList<Job> jobs=new ArrayList<Job>();
    jobs.add(new Job(1,3,5));
    jobs.add(new Job(2,5,6));
    jobs.add(new Job(4,6,5));
    jobs.add(new Job(6,7,4));
    jobs.add(new Job(5,8,11));
    jobs.add(new Job(7,9,2));
    System.out.println(MaximumProfit(jobs));
}

    private static int MaximumProfit(ArrayList<Job> jobs) {
        jobComparator comparator=new jobComparator();
        Collections.sort(jobs, new jobComparator());
        int[] profit=new int[6];
        int k=0;
        profit[0]=jobs.get(0).profit;
        for(int i=1;i<jobs.size();i++)
        {
         profit[i] = Math.max(jobs.get(i).profit, profit[i-1]);
            
         for(int j=0;j<i;j++)
         {
             if(isGreater(jobs,i,j))
             {
                profit[i]=Math.max(profit[i],jobs.get(i).profit + profit[j]);
               break;
             }
         }   
        }
        System.out.println(Arrays.toString(profit));
        return 0;
    }

    private static boolean isGreater(ArrayList<Job> jobs, int i, int j) {
        if(jobs.get(i).start >= jobs.get(j).end)
            return true;
        return false;
    }
}
