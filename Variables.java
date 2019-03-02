package oopsConcept1;

public class Variables {
	String name="Leela"; // these are global variables
	int age=23;

	public static void main(String[] args) {
		
		/*
		 * There are two types of the variables
		 	1. Global variables
		 	2.Local variables
		 */
		int i = 10;
		System.out.println(i);
		Variables v1=new Variables();
		System.out.println(v1.name);
		System.out.println(v1.age);
		v1.test();
		
		
		

	}
	
	public void test() { 
		int i=5;  // Local variable for sum method
		int j=10;
		System.out.println("This is test method or function");
		
	}

}
