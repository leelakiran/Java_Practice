package oopsConcept1;

public class Loops {
	
	public static void main(String[] args) {
		System.out.println("*********************************");
		
		// While Loop
		int i=1;
		while (i<=10) {
			System.out.println(i);
			i=i+1; // or we can write i++
			// Sometimes when 
		}
		
		System.out.println("**********************************");
		
		//For Loop
		for (int j = 1; j <= 10; j++) {
			System.out.println(j);
			
		}
		System.out.println("**********************************");
		
		//Post-Incremenet
		int a=1;
		int b=a++;
		System.out.println(a);
		System.out.println(b);
		
		//Pre-Increment
		int q=2;
		int w=++q;
		System.out.println(q);
		System.out.println(w);
		
		//Pre-Decrement
		int t=2;
		int y=--t;
		System.out.println(t);
		System.out.println(y);
		
		//Post-Decrement
		int e=2;
		int r=e--;
		System.out.println(e);
		System.out.println(r);
		
		
		int j=1;
		while(j<=10) {
			System.out.println(j);
			j=j+1;
			
		}
		
		for (int u = 1; u <= 10	; u++) {
			System.out.println(u);
			
		}
		
		
	}

}

