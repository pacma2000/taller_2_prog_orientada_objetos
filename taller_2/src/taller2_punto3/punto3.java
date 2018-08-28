package taller2_punto3;
import java.util.Scanner;

class punto3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc = new Scanner (System.in);
		
		
		int F;
		
		int C;
		
        System.out.println("Ingrese un numero: ");
		
		C = sc.nextInt();
		
		
		
		F = 32 + ( 9 * C / 5);
		
		
		
		System.out.println("La cantidad de grados centigrados que usted ingresó convertida a grados  Fahrenheit es igual a: " + F );
	    
		  
	    sc.close();
		   

	}

}
