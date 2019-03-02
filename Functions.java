package oopsConcept1;

public class Functions {

	public static void main(String[] args) {
		
		/* 
		 * after creating an object the copy of all non static methods will be given to this object
		 * Once object is created , f1 reference variable will be created to that object
		 * main method has void , beacuse it doesnt return anything
		 * main method is void,because it will never returns any value.
		 */
		
		System.out.println("*****************************");
		
		Functions f1=new Functions();
		f1.test();
		int f=f1.add();
		System.out.println(f);
		String  f2=f1.name();
		System.out.println(f2);
		int r=f1.division(4, 2);
		System.out.println(r);
		
		System.out.println("******************************");

	}
	
	/*
	 * Methods and functions both are same
	 * Three types of the methods
	 * 1. no  input and no output
	 * 2. no input some output
	 * 3. some input and some output
	 */
	
	public void test(){ // No input ,no output
		System.out.println("This is an test method");
	}
	
	public int add() { // no input , some output
		System.out.println("This is addition");
		int a=2;
		int b=3;
		int c=a+b;
		
		return c;
	}
	public String name() // no input, some output
	{
		System.out.println("This is an string");
		String nam="leela kiran";
		
		 return nam;
		 
	}
	public int division(int x, int y) { // some input, some output
		System.out.println("This is division");
		int z=x/y;
		return z;
		
	}

}
