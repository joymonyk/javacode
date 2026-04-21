package testClassJava;

class Johny{
	
	Johny(){
		System.out.println("I am ok");
	}
	
Johny(int u){
	System.out.println("I am  not ok");
	}
	
}

public class Assignment29superAdnthis extends Johny {
	
 Assignment29superAdnthis () {
	this(1);
	 System.out.println("All are fine");
}
 
 Assignment29superAdnthis (int a) {
		super();
	 System.out.println("No body is fine");
}
 public static void main(String[]args) {
	 new Assignment29superAdnthis();

 }
}
