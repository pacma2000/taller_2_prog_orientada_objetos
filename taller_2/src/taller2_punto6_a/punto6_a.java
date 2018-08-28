package taller2_punto6_a;
import java.util.Scanner;

class punto6_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a = 0 ;
		int b = 0 ;
		int c = 100;
		
		while ( b <= c ) {
		       b ++ ;
		       
		       
			if ( b < c ) {
				
				System.out.println(b + " + ");
			}
			
			else {
				
				System.out.println(" ");
			}
			
			
			a += b ;
			
			if ( b == c ) {
				
				System.out.println(" = " + a);
				
			}
				
			
		}


	}

}
