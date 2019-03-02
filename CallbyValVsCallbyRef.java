package oopsConcept1;

public class CallbyValVsCallbyRef {
	int i;
	int j;

	public static void main(String[] args) {
		
		CallbyValVsCallbyRef c1=new CallbyValVsCallbyRef();
		int x = 20;
		int y = 30;
		int val=c1.test(x, y); //call by value or pass by value 
		System.out.println(val);
		
		c1.i=30;
		c1.j=40;
		
		c1.swap(c1);
		
		System.out.println(c1.i);
		System.out.println(c1.j);

	}
	
	public int test(int a,int b) { // this method contains the photocopy of  object values
		a=3;
		b=1;
		int c=a+b;
		return c;
	}
	
	public void swap(CallbyValVsCallbyRef cc) {
		int temp;
		temp = cc.i;
		cc.i=cc.j;
		cc.j=temp;
		
		/*
		 * CallByValue is nothing but just passing the values to the method i.e, just pass the photocopy values
		 * 
		 * CallByRef is nothing but we are passing the value of the object reference is call callByRef
		 */
		
		
	}

}
