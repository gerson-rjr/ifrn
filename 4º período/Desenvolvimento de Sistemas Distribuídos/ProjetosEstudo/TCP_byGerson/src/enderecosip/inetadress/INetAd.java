package enderecosip.inetadress;
import java.net.*;
//import java.io.*;
import java.util.*;

public class INetAd {
    
    public static void main(String[] args){
        try{
            InetAddress ia = InetAddress.getByName("www.google.com");
            String endHost = ia.getHostAddress();
            String nomeHost = ia.getHostName();
            byte[] b = ia.getAddress();
            
            System.out.println("Nome+IP: " + ia);
            System.out.println("Endereço: " + endHost);
            System.out.println("Nome: " + nomeHost);
            for (int i=0; i<b.length; i++){
                System.out.print((int) b[i] + " ");
            }
        }catch(UnknownHostException e){
            e.printStackTrace();
        } 
    }

}