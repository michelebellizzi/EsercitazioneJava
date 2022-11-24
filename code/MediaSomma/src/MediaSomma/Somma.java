package MediaSomma;

import java.util.Scanner;

public class Somma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("inserisci due numeri interi: ");
		int n1, n2;
		
		n1=scanner.nextInt();
		n2=scanner.nextInt();
		var somma= n1+n2;
		System.out.println("somma: "+somma);
		var media=(somma/2);
		System.out.println("media: "+media);

		

	}

}
