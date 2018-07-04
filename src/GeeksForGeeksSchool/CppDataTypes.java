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
public class CppDataTypes {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String pattern="([A-Za-z]){1}";
        if(sc.hasNextInt())
        {
        int num=sc.nextInt();
        }
        else if(sc.hasNext(pattern))
        {
            String a=sc.next();
        }
        else if(sc.hasNextDouble())
         {
         double doub=sc.nextDouble();
         }
        
    }
    
}
