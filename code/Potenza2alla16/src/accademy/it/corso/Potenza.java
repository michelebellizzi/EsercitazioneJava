package accademy.it.corso;

public class Potenza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      int numero = 2;
	        int potenza = 16;
	        int risultato = 1;
	        int i = potenza;
	       

	        for (;i != 0; i--)
	        {
	            risultato *= numero;
	           
	        }
	        System.out.println(numero+" potenza di "+potenza + " = "+risultato);
	        
	        while(i != 0 ) {
	        	i--;
	        	risultato *= numero;
	            
	        }
	        System.out.println(numero+" potenza di "+potenza + " = "+risultato);
	    }
	}
