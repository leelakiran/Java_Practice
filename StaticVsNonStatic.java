package oopsConcept1;

public class StaticVsNonStatic {
	
	int i;
	static String name="Kiran";
	public static void main(String[] args) {
		
		// IQ  : We can call static methods with object reference aswell , but its not an good practice
		
		//Calling static methods
		//two ways
		//1.Direct calling
		you();
		System.out.println(name);
		//Calling with class name
		StaticVsNonStatic.you();
		System.out.println(StaticVsNonStatic.name);
		
		//Calling non static methods
		StaticVsNonStatic n1=new StaticVsNonStatic();
		n1.test();
		n1.you();//Warning method is diplayed
		

	}
	
	public void test() {
		System.out.println("Normal method");
		
	}
	public static void you() {
		System.out.println("Static method");
		
	}
}
