import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements MyInterface {

    public Server() throws RemoteException {
    }

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Server server = new Server();
        java.rmi.registry.LocateRegistry.createRegistry(1250);
        Naming.rebind("rmi://127.0.0.1:1250/server", server);
    }

    //reverse implementation :
    public String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }

    //minchar implementation :
    public char minchar(String str){
        int len = str.length();
        char min=str.charAt(0);
        for (int i=1;i<len;i++){
            if (min>str.charAt(i)){
                min=str.charAt(i);
            }
        }
        return min;
    }

    //casechanger implementation :
    public String casechanger(String str){
        String output="";
        for (int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if (Character.isUpperCase(c)){
                output+=Character.toLowerCase(c);
            }else{
                output+=Character.toUpperCase(c);
            }
        }
        return output;
    }
}
