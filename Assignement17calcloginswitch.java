package testClassJava;

import java.util.Scanner;

public class Assignement17calcloginswitch {
public static void main(String[]args) {
	Scanner s1 = new Scanner(System.in);
	System.out.println("please eneter value");
	int a = s1.nextInt();
	//System.out.println("please eneter aritmetic");
	//String c = s1.next();
	System.out.println("please eneter value");
	int b = s1.nextInt();
	int sum = (a+b);
	int sub = (a-b);
	int div = (a/b);
	int mul = (a*b);
	
	switch(1){
		
	case 1:{
		System.out.println("Addition= "+sum);
		break;
	}
case 2:{
	System.out.println("substraction= "+sub);
	break;
	}
case 3:{
	System.out.println("division= "+div);
	break;
	}
case 4:{
	System.out.println("multiplication= "+mul);
	break;
	}
default:{
	System.out.println("FAILED");
	break;
	}
	}
	s1.close();
}
}
