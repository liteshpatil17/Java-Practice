/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeksSchool;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class MindGame {
    public static void main(String args[])
        {
         Scanner sc=new Scanner(System.in);
         int test=sc.nextInt();
//         System.out.println(randomNum);
        for(int i=1;i<=test;i++)
        {
            
        Random ran=new Random();
        int randomNum=ran.nextInt(10)+1;
             
             int Num=randomNum;
                int add=sc.nextInt();
                Num=2*Num;
                Num=Num+add;
                Num=Num/2;
                Num=Num-randomNum;
        System.out.println(Num);
        }
    
}
}
