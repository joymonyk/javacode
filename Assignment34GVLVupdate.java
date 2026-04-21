package testClassJava;

public class Assignment34GVLVupdate {
	int a=78;
	static int b = 99; 
			
	public static void main(String[]args) {
		
		System.out.println("initial value of a b = "+b);
 b=900;
 System.out.println("updated value of b (GV) = "+b);
 Assignment34GVLVupdate a1 = new Assignment34GVLVupdate();
	System.out.println("initial value of a a = "+a1.a);
a1.a=700;
System.out.println("updated value of a (GV) = " +a1.a);

int c =22;
System.out.println("initial value of a c = " +c);
c=5;
System.out.println("updated value of a (LV) = " + c);

	}

}
