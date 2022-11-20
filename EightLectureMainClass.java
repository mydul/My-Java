package EightLecture;

import java.util.Scanner;

public class EightLectureMainClass {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		
		CustomRunnableObject firstObject=new CustomRunnableObject("FIRST", 0);
 		CustomRunnableObject secondObject=new CustomRunnableObject("Second", 200);
		CustomRunnableObject thirdObject=new CustomRunnableObject("Third", 100000);
//		CustomRunnableObject fourthObject=new CustomRunnableObject("Fourth", 5000);
		
		Thread firstThread=new Thread(firstObject);
		Thread secondThread=new Thread(secondObject);
		Thread thirdThread=new Thread(thirdObject);
		Thread forthThread=new Thread(firstObject);
		
		firstThread.start();secondThread.start();thirdThread.start();forthThread.start();
		
System.out.println("Please write a Command: ");
		
		String commandString=scanner.nextLine();
		
		while (commandString.toLowerCase().equals("exit")) {
			
			if (commandString.equals("1")) {
				System.out.println("Counter id Thread 1 :"+firstObject.getCounter());
//				threadStatus();
			}else if (commandString.equals("2")) {
				System.out.println("Counter id Thread 2 :"+secondObject.getCounter());
//				threadStatus();
			}else if (commandString.equals("3")) {
				System.out.println("Counter id Thread 3 :"+thirdObject.getCounter());
//				threadStatus();
			}else if (commandString.equals("4")) {
				System.out.println("Counter id Thread 4 :"+firstObject.getCounter());
//				threadStatus();
			}else if (commandString.equals("1S")) {
				firstThread.interrupt();
				System.out.println("Thread 1 stop");
//				threadStatus();
			}else if (commandString.equals("2S")) {
				secondThread.interrupt();
				System.out.println("Thread 2 stop");
//				threadStatus();
			}else if (commandString.equals("3S")) {
				thirdThread.interrupt();
				System.out.println("Thread 3 stop");
//				threadStatus();
			}else if (commandString.equals("4S")) {
				forthThread.interrupt();
				System.out.println("Thread 4 stop");
//				threadStatus();
			}else {
				System.out.println("Please give a proper command!!");
			}
			
			commandString=scanner.nextLine();
			
		}
		
	}
}
