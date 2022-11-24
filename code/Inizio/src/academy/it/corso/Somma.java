package academy.it.corso;

import java.util.Scanner;

public class Somma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("inserisci due numeri interi: ");
		int n1, n2;
		
		n1=scanner.nextInt();
		n2=scanner.nextInt();
		System.out.println("somma");
		System.out.println(n1+n2);
		System.out.println("media");
		System.out.println(n1+n2/2);
		

	}

}
