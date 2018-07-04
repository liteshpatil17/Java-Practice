/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Litesh
 */
class ThreadsRunnable implements Runnable
{
    ThreadsRunnable() {
        }
    Thread t;
    @Override
    public void run() {
        t=new Thread(this,);
        for(int i=0;i<10;i++)
        {
            System.out.println(t.getId()+" "+i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadsRunnable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
    }

public class threadPractice {
    public static void main(String args[])
    {
        
        Thread t=new Thread(new ThreadsRunnable(),"A");
        Thread t1=new Thread(new ThreadsRunnable(),"B");
        Thread t2=new Thread(new ThreadsRunnable(),"C");
        
        t.start();
        t1.start();
        t2.start();
        
    }
}
