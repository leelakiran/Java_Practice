package oopsConcept1;

public class MethodOverloading {
	/*
	 * MethodOverlaoding : when the method name is same with different arguments or input parameters within in the same class
	 * we cannot create an method inside an method
	 * we can overload main method
	 * same method name with same argumnets with different data types is possible
	 */

	public static void main(String[] args) {
		
		MethodOverloading m1=new MethodOverloading();
		m1.sum();
		m1.sum(23.123344);
		m1.sum(10, 23);

	}
	public void sum() {
		System.out.println("no input parameter");
	}
	public void sum(int i) {
		System.out.println("one input paramenter");
		System.out.println(i);
	}
	public void sum(double d) {
		System.out.println("One input parameter with different data types");
		System.out.println(d);
	}
	public void sum(int i,int j) {
		System.out.println("Two input parameter");
		System.out.println(i+","+j);
	}

}

