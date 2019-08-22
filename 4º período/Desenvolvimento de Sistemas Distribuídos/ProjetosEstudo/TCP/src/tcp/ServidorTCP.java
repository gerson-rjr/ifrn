package tcp;

import java.net.ServerSocket;
import java.io.IOException;
import java.net.Socket;
import java.io.InputStream;
import java.io.OutputStream;

public class ServidorTCP {
    public ServidorTCP(){
    try{
            ServerSocket ss = new ServerSocket (3322);
            System.out.println("Aguardando...");
            Socket s = ss.accept(); 
            OutputStream saida = s.getOutputStream();
            saida.write("Saudações, terráqueos.".toString().getBytes());
            saida.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    
    }
    public static void main(String args[]){
    
        ServidorTCP s = new ServidorTCP();
    
    }
}
