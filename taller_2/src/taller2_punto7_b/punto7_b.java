package taller2_punto7_b;
import java.util.Scanner;

class punto7_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner (System.in);
		
		
		int a = 1;
		int b = 1;
		int num;
		
		
        System.out.println("Digite el numero del que desea obtener el factorial: ");
		
		num = sc.nextInt();
		
		while (b <= num) {
			
			if (b <= num) {
				
				System.out.println(b + " * ");
			}
			
			else {
				
				System.out.println(num);
			}
			
			a  = b  *  a;
			
			if (b == num ) {
				
				System.out.println(" = " + a);
			}
			
			b ++;
			
			sc.close();
			   
		}

		
	}

}
