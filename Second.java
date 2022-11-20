import java.util.Scanner;

public class Second {
	
	static Scanner myScanner=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstIntNumber=10;
		int secondIntNumber=20;
		double sum=firstIntNumber%3;
		sum+=2;
		boolean stetement=prokria(firstIntNumber,secondIntNumber);
		
		char[] cards={'R','n','3','9'};
		
		System.out.println(firstIntNumber);  
		System.out.println(secondIntNumber);
		System.out.println(sum);
		System.out.println(stetement);
		System.out.println(cards[3]);
		
		int resultnew=testing(firstIntNumber);
		System.out.print("Plrase type a number");
		firstIntNumber=myScanner.nextInt();
		System.out.println(resultnew);
	}
	static public boolean prokria(int r,int s) {
		boolean answer=r<s;
		return answer;
	} 
	static public int testing(int value){
		value*=100;
		return value;
	}

}
