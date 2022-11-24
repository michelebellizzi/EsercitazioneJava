package accademy.it.giornoSettimana;

import java.util.Scanner;

public class GiornoSettimana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("inserisci il giorno della settimana: ");
		int giorno;
	    giorno=scanner.nextInt();
		
		switch(giorno) {
		case 1:
			System.out.println("lunedi");
			break;
		case 2:
			System.out.println("martedi");
			break;
		case 3:
			System.out.println("mercoledi");
			break;
		case 4:
			System.out.println("giovedi");
			break;
		case 5:
			System.out.println("venerdi");
			break;
		case 6:
			System.out.println("sabato");
			break;
		case 7:
			System.out.println("domenica");
			break;
		default:
			System.out.println("la settimana è composta da 7 giorni");
			break;
			
			
		}

	}

}
