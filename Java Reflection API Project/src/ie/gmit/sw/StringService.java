package ie.gmit.sw;

import java.rmi.Remote;
import java.rmi.RemoteException;
//Interface with comparison that will be used multiple times throughout the project
public interface StringService extends Remote{
	public Resultator comparison(String s, String t, String result) throws RemoteException;
}
