package testClassJava;

import java.util.Scanner;

public class Assignment21AdditionOfStudents {
  public static void main (String[]args) {
	  
	  Scanner s1 = new Scanner(System.in);
	  
	  for(int i=1;i<=10;i++) {
		  System.out.println("Student " + i);
		  System.out.println("number 1");
		 int a = s1.nextInt();
		  System.out.println("number 2");
		  int b = s1.nextInt();
		  
		  int sum = a+b;

		System.out.println("output="+sum);
		System.out.println("----------");
	
		 
	  }
		s1.close();
  }
}
