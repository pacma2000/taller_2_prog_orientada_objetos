package taller2_punto2;
import java.util.Scanner;

class punto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner (System.in);
		
		
		int n;
		int nB;
		int nC;
		int nD;
		
		System.out.println("Digite el numero: ");
		
		n=sc.nextInt();
		
		
	    nB = n*2;
	    nC = n*4;
	    nD = n*5;
	    
	    
	    System.out.println("El numero que usted ingreso es: " + n + ", su doble es " + nB + ", su cuadruple es " + nC + " y su quintuple " + nD);
	    
	  
	   sc.close();
	   
	}

}
