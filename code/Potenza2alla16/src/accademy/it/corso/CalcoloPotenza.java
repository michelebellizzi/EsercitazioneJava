package accademy.it.corso;

import java.util.Scanner;

public class CalcoloPotenza {
	public int calcola() {
		Scanner scanner= new Scanner (System.in);
		System.out.println("inserisci numero: ");
		 int numero = scanner.nextInt();
		 System.out.println("inserisci elevazione: ");
	        int potenza = scanner.nextInt();
	        int risultato = 1;
	        int i = potenza;
	        
	        for (;i != 0; i--)
	        {
	            risultato *= numero;
	            
	           
	        }
	       return risultato;
	}

}
