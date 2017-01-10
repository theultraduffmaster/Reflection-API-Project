package ie.gmit.sw;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
//A class that exposes all the methods defined in Resultator
public class ResultatorImpl extends UnicastRemoteObject implements Resultator {
	private static final long serialVersionUID = 1L;

	private boolean processed;
	private String result;

	protected ResultatorImpl() throws RemoteException {
		super();
	}

	@Override
	public String getResult() throws RemoteException {
		return result;
	}

	@Override
	public void setResult(String result) throws RemoteException {
		this.result = result;

	}

	public boolean isProcessed() {
		return processed;
	}

	public void setProcessed() {
		this.processed = true;
	}

}