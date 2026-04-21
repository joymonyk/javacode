package testClassJava;

public class Assignement22WAPLVGVFV {

	int a =25; //global
	final int b =88;  //final
	
	void joy() {
		
		int a =34;//local variable
		System.out.println(a);
	}
	
	public static void main (String[]args) {
		Assignement22WAPLVGVFV  j1 = new Assignement22WAPLVGVFV() ;
		j1.joy() ;
		System.out.println(j1.a);
		System.out.println(j1.b);
	}
}
