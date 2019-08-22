package tcp;

import java.net.*;
import java.io.*;

public class ClienteTCP {
    public ClienteTCP(){
    try{
            Socket s = new Socket("127.0.0.1", 3322);
            InputStream is = s.getInputStream();
            byte[] b = new byte[100];
            is.read(b);
            is.close();
            String str = new String(b);
            System.out.println(str);
        }catch(UnknownHostException uhe){
            uhe.printStackTrace();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }   
    }
    public static void main(String args[]){    
        ClienteTCP c = new ClienteTCP();
    }   
}