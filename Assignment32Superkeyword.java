package testClassJava;

class  Rock {
 void james() {
	
	System.out.println("heloow");
}
}


public class Assignment32Superkeyword extends Rock {
	void james() {
		
		System.out.println("I am fine");
		super.james();
	}
	public static void main(String[]args) {
		
		Assignment32Superkeyword a1 = new Assignment32Superkeyword();
		a1.james();
	}
}
