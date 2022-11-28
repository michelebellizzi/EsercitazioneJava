package ntt.it.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int num;
		int numeri[]= new int [10];
		System.out.println("inserisci 10 valori interi: ");
		for(int i=0; i<10;i++){
			num= input.nextInt();
			numeri[i]= num;
			
		}
		System.out.println("Numeri: ");
		Arrays.sort(numeri);
		for (int n: numeri) {
			System.out.println(n);
			
		}
			

	}
	
	

}
