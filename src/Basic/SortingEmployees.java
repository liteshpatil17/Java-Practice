/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


/**
 *
 * @author Litesh
 */
public class SortingEmployees {
   
           static class Emp
            {
               String  name;
             int salary;
            }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {   
            int noOfRecord=sc.nextInt();
            ArrayList<Emp> al=new ArrayList<Emp>();
            for(int i=0;i<noOfRecord;i++)
            {
                Emp emp= new Emp();
                emp.name=sc.next();
                emp.salary=sc.nextInt();
                al.add(emp);
            }
            
            Collections.sort(al, new Comparator<Emp>()
                    {	
                        public int compare(Emp o1,Emp o2)
                        {
                            int cmp=Double.compare(o1.salary, o2.salary);
                            if(cmp==0)
                                return o1.name.compareTo(o2.name);
                            return cmp;
                        }
                    });
            
            for(int i=0;i<noOfRecord;i++)
            {
                System.out.print(al.get(i).name+" "+al.get(i).salary+" ");
            }
            System.out.println();
            test--;
        }
        
    }
}
