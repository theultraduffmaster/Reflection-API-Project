package ie.gmit.sw;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

//Map class that maps the result from the BlockingQueue class into an OutQueue map
public class CompareStringImpl extends UnicastRemoteObject implements StringService{
	//call itself
	protected CompareStringImpl() throws RemoteException {
		super();

	}




	private static final long serialVersionUID = 1L;
	private Map<String, AlgoStrings> stringAlgos = new HashMap<String, AlgoStrings>(); //mapping result from blocking queue here
	
	
	
	//Overriding what was set up in StringService and then passing it onto AlgorithmRunner to finish
	@Override
	public Resultator comparison(String String1, String String2, String algorithm){
		CompareStringable stringAlgo = stringAlgos.get(algorithm.toLowerCase()).getNewInstance();
		Resultator r = null;
		try {
			r = new ResultatorImpl();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		Thread newThread = new Thread(new AlgorithmRunner(r, stringAlgo, String1, String2));
		newThread.start();
		return r;
	}
}