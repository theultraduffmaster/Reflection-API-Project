package ie.gmit.sw;

import java.rmi.RemoteException;
//A runner class that overrides run
public class AlgorithmRunner implements Runnable {
	//Instantiate the variables
	Resultator r;
	CompareStringable stringAlgo;
	String String1;
	String String2;

	//Creating instances of variables
	public AlgorithmRunner(Resultator r, CompareStringable stringAlgo, String String1, String String2) {
		this.r = r;
		this.stringAlgo = stringAlgo;
		this.String1 = String1;
		this.String2 = String2;
	}

	@Override
	public void run() {
		try {
			//sets result to teh difference between the two strings
			r.setResult(stringAlgo.differences(String1, String2));
			try {
				Thread.sleep(10000); //10 seconds
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block 
				e.printStackTrace();
			}
			//Set the processed to finished
			r.setProcessed();
			System.out.println(r + "is processed");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}