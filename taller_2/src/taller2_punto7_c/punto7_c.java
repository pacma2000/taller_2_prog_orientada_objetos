package taller2_punto7_c;
import java.util.Scanner;

class punto7_c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int l = 10;
		int c = 1;
		int a = 0;
		int  b = 1;
	
		
		 System.out.println(a + b);
		 
		while ( c <= l ) {
			c = a  + b;
			
			 System.out.println(c);
			a = b;
			b = c;
			
			c += 1;
		}

	}

}
