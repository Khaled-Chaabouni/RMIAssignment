import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface extends Remote {
    public String reverse(String s) throws RemoteException;
    public char minchar(String s) throws RemoteException;
    public String casechanger(String s) throws RemoteException;
}
