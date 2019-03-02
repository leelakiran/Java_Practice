package oopsConcept1;

public class One {
	
	int i;
	String s;

	public static void main(String[] args) {
		
		System.out.println("**************************");
		/*
		 *  new One() is  the objects of the One class
		 *  n,n1,n2 are the reference varaibales of the object
		 *  new is the keyword to create the object
		 */
		System.out.println("**************************");
		
		
		One n=new One();
		One n1=new One();
		One n2=new One();
		
		n.i=2;
		n.s="Leela";
		
		n1.i=3;
		n1.s="kiran";
		
		n2.i=4;
		n2.s="Leela kiran";
		
		System.out.println(n.i);
		System.out.println(n.s);
		
		System.out.println(n1.i);
		System.out.println(n1.s);
		
		System.out.println(n2.i);
		System.out.println(n2.s);

	}

}
