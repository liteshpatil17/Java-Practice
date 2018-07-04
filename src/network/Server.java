/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package network;

import java.io.*;
import java.net.*;

/**
 *
 * @author Litesh
 */
public class Server {
    Socket socket=null;
    ServerSocket server=null;
    DataInputStream input=null;
    
    public Server(int port) throws IOException
    {
        server=new ServerSocket(port);
        System.out.println("Server started");
        System.out.println("Waiting for a client ...");
        socket=server.accept();
        System.out.println("Connected to client");
        input=new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        String line="";
        while(!line.equals("End"))
        {
            line=input.readUTF();
            System.out.println(line);
            
        }
        System.out.println("Closing connection");
        socket.close();
        input.close();
    }
    
    public static void main(String args[]) throws IOException    
    {
        Server server=new Server(500);
    }
}
