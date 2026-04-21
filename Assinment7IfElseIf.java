package testClassJava;

public class Assinment7IfElseIf {
public static void main (String[]args) {
	
	int a = 18;
	int b = 65;
	if(a>17) {
		System.out.println("SHOULD VOTE");
	}
	else if (a==18) {
		System.out.println("ELIGIBLE TO VOTE");
	}
	else {
		System.out.println("CANNOT VOTE");
	}
	if(b>65) {
		System.out.println("SENIOR CITIZEN LIST 1");
	}
	else if (b==65) {
		System.out.println("SENIOR CITIZEN LIST 2");
	}
	else {
		System.out.println("NOT a SENIOR");
	}
	if(b>65) {
		System.out.println("SENIOR CITIZEN LIST 1");
	}
	else if (b==60) {
		System.out.println("SENIOR CITIZEN LIST 2");
	}
	else {
		System.out.println("NOT a SENIOR");
	}
}
}
