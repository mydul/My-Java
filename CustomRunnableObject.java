package EightLecture;

import org.w3c.dom.css.Counter;

import Seventhlecture.OurThread;

public class CustomRunnableObject implements Runnable {
	
//	private boolean stopFlag=false;
	private String name;
	private int Counter;
	
	//............Constractor.........
	public CustomRunnableObject(String name, int counter) {
		super();
		this.name = name;
		Counter = counter;
	}
	
	//.............Geter abd Seter..........
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		Counter = counter;
	}

	@Override
	public void run() {
		while (!Thread.currentThread().isInterrupted()) {
			Counter++;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					break;
				}
		}
		
	}

}
