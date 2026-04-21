package testClassJava;


abstract class Abstrac{
	
	abstract void add();
	
}

public class Assignment41Abstractandconcret extends Abstrac {
	 void add() {
			
		System.out.println("john is fine");
	}

public static void main(String[]args) {
	Assignment41Abstractandconcret a1= new Assignment41Abstractandconcret();
	a1.add() ;
}

}
