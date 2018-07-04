
package Basic ;
import java.util.*;
import java.lang.*;
import java.io.*;

class Test {
    
    static void TOH(char start_rod,char final_rod,char aux_rod,int d)
    {
        if(d==1)
        {
            System.out.println("Move disk 1 from rod " +  start_rod + " to rod " + final_rod);
            return;
        }
        TOH(start_rod,aux_rod,final_rod,d-1);
        System.out.println("Move disk "+d+" from rod " +  start_rod + " to rod " + final_rod);
        TOH(aux_rod,final_rod,start_rod,d-1);
        
    }
    
    public static void main (String[] args) {
	
	  Scanner sc=new Scanner(System.in);
          int n =sc.nextInt();
          char r_start='A',r_final='C',r_aux='B';
	 TOH(r_start,r_final,r_aux,n);
	}
}