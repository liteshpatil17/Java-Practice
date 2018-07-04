/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

import java.io.*;
import java.util.regex.*;

class assignment1{
    public static void main(String args[]) throws Exception 
 {
 //Input File Reader
 FileReader fr = new FileReader("V:/hindi.txt");
 BufferedReader br = new BufferedReader(fr);
 String s;
 //Output gets stored in output.txt
 OutputStream out = new FileOutputStream("V:/output.txt");
                      String token[];
 
 while((s = br.readLine()) != null)
    {
     //Delimiter considered is . and compared using pattern matching technique
      Pattern pat1 = Pattern.compile("[.]");
      token = pat1.split(s);
      for(int i=0;i<token.length;i++)
       {
         byte buf[]=token[i].getBytes();
 
                             // Writing into a file with a new line character indicating beginning of a new line after every sentence
          for(int j=0;j<buf.length;j=j+1)
         {
                                out.write(buf[j]);
                 if(j==buf.length-1)
                    out.write('n');
            }
         }
      }
       fr.close();
  }
}