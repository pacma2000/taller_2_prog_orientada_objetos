package taller2_punto7_a;
import java.util.Scanner;

class punto7_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc = new Scanner (System.in);

		
		int n;
		int i,j;
		
		
        System.out.println("Digite el numero del que desea conocer las tablas de multiplicar: ");
		
		n = sc.nextInt();
		
		
		for(i = 1; i<=n; i++) {
	
        
            for(j=1; j<=12; j++){
            
                System.out.println(n + " * " + j + " = " + n*j);
                
                }
            
            System.out.println();
			  
	    sc.close();
		   

	}


	}

}
