package taller2_punto6_b;
import java.util.Scanner;

class punto6_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 0;
		int a = 0;
		
		
		while (n <= 50 ) {
			
		n ++ ;
		
		if (n  %  2  ==  0 ) {
			
			a  =  n  +  a;
		}
		
		}
		
		System.out.println("La suma de los pares es: " + a);


	}

}
