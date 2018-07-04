/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class FindThePositionOfMthItem {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
            int N=sc.nextInt();
            int M=sc.nextInt();
            int K=sc.nextInt();
            int pos=-1;
            
            pos=(M+K)%N;
            if(pos==0||pos==1)
                pos=N-1;
            else
                pos--;

            System.out.println(pos);
        test--;}
    }
}
