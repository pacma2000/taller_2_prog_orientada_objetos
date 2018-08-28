package taller2_punto5;
import java.util.Scanner;

class punto5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner (System.in);
		
		float vel;
		
		float m;
		
        System.out.println("Ingrese una velocidad en Km/h para convertirla a m/s: ");
		
		vel = sc.nextInt();
		
		m = vel*1000/3600;
		
		
		System.out.println(vel + " Km/h al realizar la conversion es igual a " + m + " m/s.");
		
		sc.close();

	}

}
