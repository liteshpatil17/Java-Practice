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
public class NumbersWith0AsDigit {
    public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            int test=sc.nextInt();
            for(int i=1;i<=test;i++)
                {
                    int n=sc.nextInt();
                    int totalNos=0; 

                    for(int j=1;j<=n;j++)
                        {
                            String s=Integer.toString(j);
                            if(s.contains("0"))
                                {
                                    totalNos++;
                                }
                        }
                    System.out.print(totalNos);
                }
        
        }
}
