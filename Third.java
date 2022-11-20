import java.util.Scanner;

public class Third {
	static Scanner myScanner=new Scanner(System.in);
	
	public static void main(String[] args) {
		String myName;
		prln("Please write your name:");
		myName=myScanner.nextLine(); //In string space,number,charectar all arecountable
		
//		System.out.println("Its our old Method");
//		System.out.println(myName);
//		prln("/n The number of char of my name is: "+myName.length());
//		pr("Its our New method");
//		prln(myName);
		
		// Two Dimentional Array
		int[][] twoDarrey=new int[2][4];
		
		twoDarrey[0][0]=1;
		twoDarrey[0][1]=2;
		twoDarrey[0][2]=4;
		twoDarrey[0][3]=5;
		//twoDarrey[row][callam]
		twoDarrey[1][0]=2;
		twoDarrey[1][1]=4;
		twoDarrey[1][2]=5;
		twoDarrey[1][3]=9;
		
		twoDarrey[1][2]+=(twoDarrey[0][2]+twoDarrey[0][3]);
		//prln("At 2D Array:"+twoDarrey[1][2]);
//		1 2 4 5
//		2 4 5 9
		
		if (myName.length()<15 && myName.length()>10) {
			prln("Your Name is too long");
		}
		else if (myName.length()<2) {
			prln("Your Name is too short");
		}
		else {
			switch (myName.length()) {
			case 7:prln("Wao!! You are perfect 7.");
				break;
			case 6:prln("Wao!! You are perfect 6.");
				break;
			case 5:prln("Wao!! You are perfect 5.");
				break;
			case 9:prln("Wao!! You are perfect 9.");
				break;

			default:prln("Your name is OK");
				break;
			}
//			if (myName.length()==7) {
//				prln("Wao!! You are perfect.");
//			}
//			else {
//				prln("Your name is OK");
//			} 
		int a=3;
		int b=9;
		a+=(++b);  
		prln("A:" +a+ "B" +b);
		}
		
	}
	// print & println k use er subidhay object creat
	static void prln(Object anyObject){
		System.out.println(anyObject);
	}
	static void pr(Object anyObject){
		System.out.println(anyObject);

	}

}
