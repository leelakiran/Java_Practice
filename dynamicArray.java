package oopsConcept1;

public class dynamicArray {

	public static void main(String[] args) {
		System.out.println("******************************************");
		
		//If the the data is stored in table with 3 rows and 3 columns
		
		/*Note : We can write the array like Object [][]s=new Object[3][3];*/
		
		
		
		Object s[][]=new Object[3][3];
		
		//length of the row
		System.out.println("No.of rows ="+s.length);
		//lenght of cloumns
		System.out.println("No.of cols ="+s[1].length);
		
		s[0][0]="Leela";
		s[0][1]=25;
		s[0][2]='v';
		
		s[1][0]="Manoj";
		s[1][1]="24";
		s[1][2]='t';
		
		s[2][0]="Kiran";
		s[2][1]=23;
		s[2][2]='m';
		
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {
				System.out.println("Total values of the tables =" +s[i][j]);
			}
		}
		
		
		

	}

}
