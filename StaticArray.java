package oopsConcept1;

public class StaticArray {

	public static void main(String[] args) {
		
		System.out.println("*************************************************");
		
	/*	Array : 
			* The length is constant
			* The size of the array is index-1
			* One Dimensional array 
		
		*Disadvantages :
			* The size is fixed - to overcome we use collections framewrok ex: ArrayList,Hashtable or also called dynamic array
			* Stores only similar datatypes - to overcome this we use object array ex: in one array we have store age, name
			
		*/
		
		 /*  IQ
		  * If we try to print morethan the specified lenght of the array , then we will get ArrayOutofBoundException
		  */
		
		System.out.println("*************************************************");
		
		//1.Int Array:
		int k[]=new int[3];
		k[0]=1;
		k[1]=2;
		k[2]=3;
		
		 for (int t = 0; t < k.length; t++) {
			 System.out.println(k[t]);
			
		}
		 
		 /*Note : We can write the array like double []i=new double[3]*/
		
		//if we try to print the numbers in the array morethan the specified array then it will throw an arrayoutofboundException
		
		System.out.println("*************************************************");
		
		//2.Double Array
		
		double i[]=new double[3];
		i[0]=34.8;
		i[1]=89.0;
		i[2]=45;
		
		System.out.println(i[0]);
		
		
		System.out.println("*************************************************");
		//3. String Array
		
		String s[]=new String[1];
		s[0]="Kiran";
		System.out.println(s[0]);
		
		System.out.println("*************************************************");
		//4. char Array
		
		char c[]=new char[2];
		c[1]='f';
		System.out.println(c[1]);
		
		System.out.println("*************************************************");
		
		//5. Boolean array
		boolean b[]=new boolean[2];
		b[1]=true;
		System.out.println(b[1]);
		
		
		// 6. Object array
		Object ob[]=new Object[4];
		ob[0]="Leela kiran";
		ob[1]=24;
		ob[2]='V';
		ob[3]="venkatagiri";
	}

}
