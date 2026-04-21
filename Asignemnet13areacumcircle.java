package testClassJava;

import java.util.Scanner;

public class Asignemnet13areacumcircle {
public static void main(String[]args) {
	
	Scanner s1 = new Scanner(System.in);
	System.out.println("Please enter radious of a circle = ");
	double radious = s1.nextDouble();
	double area = 3.14*radious*radious;
	double circumference = 2*3.14*radious;
	System.out.println("area of a circle ="+area);
	System.out.println("circumference of a circle ="+circumference);
	s1.close();
	
	
}
}
