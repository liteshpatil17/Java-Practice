/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Litesh
 */
public class CountTheCharacters {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
           String str=sc.next();
           int n=sc.nextInt();
           int repetedChar=0,nextele=0;
           
           char arr[]=str.toCharArray();
           
           ArrayList al=new ArrayList();
           int count;
           int k=0,l=1;
           
           for(k=0;k<arr.length;k++)
           {
               int p=k+1;
               if(arr[k]==arr[p])
               {
                   al.add(arr[k]);
                   continue;
               }
               System.out.println(arr[k]);
           }
               

           }
           
           
           
//           Arrays.sort(arr);
//           
//           System.out.println(Arrays.toString(arr));
//           
//           for(int i=0;i<arr.length;i=i+count)
//           {
//               count=0;
//               for(int j=0;j<arr.length;j++)
//               {
//               if(arr[i]==arr[j])
//               {
//   //                System.out.println(arr[i]+" "+arr[j]);
//                   count++;
//   //                System.out.println(arr[i]+"="+count);
//               }
//              // nextele=count;
//               }
//               
//         //      System.out.println("count ="+count);
//               if(count%n==0)
//               {
//                   repetedChar=repetedChar+1;
//                   System.out.println("repetedChar ="+repetedChar);
//               }
//           }

        test--;
        }
    }
}
