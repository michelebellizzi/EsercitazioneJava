package accademy.it.corso;

import java.util.Scanner;

public class Potenza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("inserisci numero: ");
		 int numero = scanner.nextInt();
		 System.out.println("inserisci elevazione: ");
	        int potenza = scanner.nextInt();
		System.out.println(calcola(numero, potenza));
		

	}
	public static int calcola(int numero, int potenza) {
		Scanner scanner= new Scanner (System.in);
		
	        int risultato = 1;
	        int i = potenza;
	        
	        for (;i != 0; i--)
	        {
	            risultato *= numero;
	            
	           
	        }
	       return risultato;
	}
}
