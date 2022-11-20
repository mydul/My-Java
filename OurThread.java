package Seventhlecture;

import org.w3c.dom.css.Counter;

public class OurThread extends Thread {
	
	//................Variable...............
	private String threadName;
	public int startingPoint;
	private int counter;
	private int adder;
	private int timerDifference;
	private OurThread dependentThread;
	
	private boolean threadAliveFlag;
	
	//....................constructor............
	public OurThread(String threadName, int startingPoint, int adder, OurThread dependentThread,
			int timerDifference, boolean threadAliveFlag) {
		super();
		this.threadName = threadName;
		this.startingPoint = startingPoint;
		this.counter = counter;
		this.adder = adder;
		this.timerDifference = timerDifference;
		this.threadAliveFlag = threadAliveFlag;
		
		this.dependentThread=dependentThread;
	}
	
	//.......................run method........
	@Override
	public void run() {
		
		counter=startingPoint;
		
		if (dependentThread!=null) {
			try {
				dependentThread.join();
			} catch (InterruptedException e1) {
				// TODO: handle exception
				e1.printStackTrace();
			}
		}
		
		while (threadAliveFlag) {
			counter+=adder;
			try {
				sleep(timerDifference);
			} catch (InterruptedException e) {
				// TODO: handle exception
				
			}
			
		}
	}
	
	public void stopThread() {
		threadAliveFlag=false;
	}
	
//......................Getters and Setter....................
	public String getThreadName() {
		return threadName;
	}

	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}

	public int getStartingPoint() {
		return startingPoint;
	}

	public void setStartingPoint(int startingPoint) {
		this.startingPoint = startingPoint;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public int getAdder() {
		return adder;
	}

	public void setAdder(int adder) {
		this.adder = adder;
	}

	public int getTimerDifference() {
		return timerDifference;
	}

	public void setTimerDifference(int timerDifference) {
		this.timerDifference = timerDifference;
	}

	public boolean isThreadAliveFlag() {
		return threadAliveFlag;
	}

	public void setThreadAliveFlag(boolean threadAliveFlag) {
		this.threadAliveFlag = threadAliveFlag;
	}

	

	

}
 