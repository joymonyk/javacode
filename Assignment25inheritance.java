package testClassJava;


class ParentJoy {
	static void joy(){
	int a =5;
	int b =5;
	int sum = a+b;
	System.out.println(sum);
	}
}

public class Assignment25inheritance extends ParentJoy {
	
	
	static void james(int a, int b)
	{
		int mul = a*b;
		System.out.println(mul);
	}
	public static void main(String []args) {
		
james(3,3);
joy();

	}
}
