package testClassJava;

import java.util.Scanner;

public class Assignement16square {
	public static void main(String[]args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Side of a Square = ");
		int S = s1.nextInt();
		int out = S*S;
			int Cirecumference = 4*S;
			System.out.println("Area of a Square = "+out);
			System.out.println("circumfer of a Square = "+Cirecumference);
			s1.close();
		
}
}