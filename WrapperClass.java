package oopsConcept1;

public class WrapperClass {

	public static void main(String[] args) {
		
		/* 
		 * if we need to convert String into integer or anyother datatype then we have Integer or other datatype classes wwith parseInt() method
		 */
		
		//Data Conversion
		
		//String to integer conversion
		String orderid="98745";
		int sorderid=Integer.parseInt(orderid);
		System.out.println(sorderid+2);
		
		//String to  double
		String n="34.56";
		double r=Double.parseDouble(n);
		System.out.println(r+10);
		
		/*  we cannot change string to char*/
		
		//Integer to string
		
		int i=90;
		String j=String.valueOf(i);
		System.out.println(j+20);
		
		

	}

}
