package testClassJava;

public class Assignment11WAPmethodOVEr {
	
static void joy(int a,int b) {
		
		int sum = a+b;
		System.out.println(sum);
	}
static void joy(int a,double b) {
	
	double sum = a+b;
	System.out.println(sum);
}
void james() {
	int c = 3;
	int d = 2;
	int mul = c*d;
	System.out.println(mul);
}

void james(int c, int d) {
	
	int mul = c*d;
	System.out.println(mul);
}
Assignment11WAPmethodOVEr() {
	int e = 34;
	int f = 2;
	int div = e/f;
	System.out.println(div);
}
Assignment11WAPmethodOVEr(int e,int f) {
	
	int div = e/f;
	System.out.println(div);
}
public static void main(String[] args) {
	
	joy(2,3);
	Assignment11WAPmethodOVEr j1= new Assignment11WAPmethodOVEr();
	j1.james();
	j1.james(33,78);
	new Assignment11WAPmethodOVEr(322245,890);
}
}
