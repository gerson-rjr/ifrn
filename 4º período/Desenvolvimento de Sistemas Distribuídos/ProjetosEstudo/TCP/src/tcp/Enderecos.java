package tcp;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Enderecos {
    public static void main(String args[]){
    
    try{
        InetAddress ia = InetAddress.getByName("www.google.com");
        String endHost = ia.getHostAddress();
        String nomeHost = ia.getHostName();
        byte[] octetos = ia.getAddress();
        
        System.out.println("End. Host: "+endHost);
        System.out.println("Nome Host: "+nomeHost);
    } catch(UnknownHostException e){
        e.printStackTrace();
    }
    }
    
}
