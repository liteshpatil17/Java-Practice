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
public class MaximumMoneyAmazon {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
            int NoOfHouses=sc.nextInt();
            int MoneyPerHouse=sc.nextInt();
            double CanRob=((double)NoOfHouses)/((double)2);
            int robed=(int) Math.ceil(CanRob);
            int TotalMoney=robed*MoneyPerHouse;
            System.out.println(TotalMoney);
        
        test--;}
    }
    
}
