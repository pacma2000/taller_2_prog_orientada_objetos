package taller_2_punto1;
import java.util.Scanner;
class punto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc = new Scanner (System.in);
		
		float[] n= new float[4];
		int i;
		
		System.out.println("Ingrese cuatro numeros: ");
		
		for(i=0;i<4;i++) {
			
			n[i]=sc.nextFloat();
			
		}
		sc.close();
		for (i=3;i>=0;i--) {
			System.out.println(""+n[i]);
		}
		
	}

}
