package ie.gmit.sw;

import java.rmi.RemoteException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
//A blocking queue class (in queue)
public class AlgoStrings implements Runnable {
	
	public static void main(String[] args) throws RemoteException {
		JobAssign jobA = new JobAssign(); //used ofr assigning job numbers
		StringServiceImpl SSI = new StringServiceImpl(); //for passing into blockingqueue
		try {
			SSI = new StringServiceImpl();
		} catch (RemoteException error) {
			// TODO Auto-generated catch block
			error.printStackTrace();
		}
		//Start of BlockingQueue
		BlockingQueue<StringServiceImpl> linkedBQueue = new LinkedBlockingQueue<StringServiceImpl>();
		try {
			linkedBQueue.put(SSI);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //puts object into BlockingQueue
		System.out.println("size of BlockingQueue before peek : " + linkedBQueue.size());       
		System.out.println("example of peek() in BlockingQueue: " + linkedBQueue.peek());
		System.out.println("size of BlockingQueue after peek : " + linkedBQueue.size());
		System.out.println("calling poll() on BlockingQueue: " + linkedBQueue.poll());
		System.out.println("size of BlockingQueue after poll : " + linkedBQueue.size());
		System.out.println("Added Task No:" + jobA.getJobNum());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	//Generated by CompareStringImpl
	public CompareStringable getNewInstance() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
