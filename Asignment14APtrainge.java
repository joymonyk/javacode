package testClassJava;

import java.util.Scanner;

public class Asignment14APtrainge {
public static void main(String[]args) {
	Scanner s1 = new Scanner(System.in);
	System.out.println("Breath of a triangle = ");
	int L = s1.nextInt();
	System.out.println("Height of a triangle = ");
	int H = s1.nextInt();
		double out = 0.5*L*H;
		int Cirecumference = L*H*H;
		System.out.println("Area of a triangle = "+out);
		System.out.println("circumfer of a triangle = "+Cirecumference);
		s1.close();
	
}
}
