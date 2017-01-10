package ie.gmit.sw;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class StringServiceImpl extends UnicastRemoteObject implements StringService
{
	private Resultator r;
	private static final long serialVersionUID = 1L;

	public StringServiceImpl() throws RemoteException
	{
		
	}
	//Overrides stringServie to start a new thread
	@Override
	public Resultator comparison(String String1, String String2, String result) throws RemoteException
	{
		r = new ResultatorImpl(); 
		//ComparerOfStrings comparerString = new ComparerOfStrings(String1, String2, r, r);
		//Thread comparer = new Thread(comparerString);
		//comparer.start();
			
		return r; 
	}
}