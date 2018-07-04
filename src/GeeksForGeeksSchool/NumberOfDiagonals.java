/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeksSchool;

import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class NumberOfDiagonals {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        for(int t=1;t<=test;t++)
            {
              int no_of_points=sc.nextInt();
              int no_of_diagonal=(no_of_points)*(no_of_points-3);
              System.out.println(no_of_diagonal);
            }
    }
    
}
