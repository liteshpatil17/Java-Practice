/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class RotateAndDelete {
     
    static Integer rotateDelete(LinkedList<Integer> arr)
    {
        int len=arr.size();
        int noOfRotation=0;
        if(len==1)
            return arr.get(0);
       LinkedList<Integer> rot=new LinkedList<Integer>(arr);
       while(len>1)
        {
                int ind=rot.size()-1;
                int last=rot.size()-1;
                rot.addFirst(rot.remove(last));
            if(rot.size()>noOfRotation)
            {   
                
                rot.remove(last-noOfRotation);
//                System.out.println("B ="+rot);
                noOfRotation++;
                
            }
            else if(rot.size()<(noOfRotation+1))
            {   
//                System.out.println("C" + rot);
                rot.remove(0);
//                System.out.println("D ="+rot);
                noOfRotation++;
            }
        len--;}
       return rot.get(0);
    }
 
    
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        
        while(test>0){
        
            int len=sc.nextInt();
            LinkedList<Integer> arr;
            arr = new LinkedList();
            for(int i=0;i<len;i++)
                arr.add(sc.nextInt());
             Integer lastRemaining=rotateDelete(arr);
             System.out.println(lastRemaining);
        test--;}
    }
}
