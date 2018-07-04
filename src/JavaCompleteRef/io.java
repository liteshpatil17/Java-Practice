/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCompleteRef;

import java.io.*;


/**
 *
 * @author Litesh
 */
public class io {
  public static void main(String args[]) throws IOException 
  {
      FileInputStream f = null;
      FileOutputStream fout = null;
      int i,o;
      BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
      try{
        f=new FileInputStream(b.readLine());
        fout=new FileOutputStream(b.readLine());
        
      }catch(FileNotFoundException e){System.out.println("File Not Found");}
      
      do{
          i=f.read();
          fout.write(i);
          if(i!=-1){ 
              System.out.println((char)i);
          }
      }while(i!=-1);
      
      
      f.close();
  }}

