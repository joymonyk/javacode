package testClassJava;

public class Assignment36FinalV {
	
	final int a = 34;
	public static void main (String[]args) {
		 
		final int b =7;
	//	b = 98;  Final wont be updated
		System.out.println("localvaribale = "+b);
		Assignment36FinalV a1 = new Assignment36FinalV();
		System.out.println("Globalvaribale = "+a1.a);
 	//	a1.a =455;  Final wont be updated
		System.out.println("Globalvaribale = "+a1.a);
	}

}
