package testClassJava;

import java.util.Scanner;

public class Assignment12Scannerclass {

	public static void main (String[]args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("please enter  a:-");
		int a = s1.nextInt();
		System.out.println("please enter  b:-");
		int b = s1.nextInt();
		System.out.println("Addition output : = ");
		int sum = a+b;
		System.out.println(sum);
		s1.close();
	}
}
