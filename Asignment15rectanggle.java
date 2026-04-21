package testClassJava;
import java.util.Scanner;

public class Asignment15rectanggle {
	

	public static void main(String[]args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Length of a rectange = ");
		int L = s1.nextInt();
		System.out.println("Breadth of a rectangle = ");
		int B = s1.nextInt();
		int out = L*B;
			int Cirecumference = 2*(L+B);
			System.out.println("Area of a Rectangle = "+out);
			System.out.println("circumfer of a rectangle = "+Cirecumference);
			s1.close();
		
	}
	}

