package accademy.it.corso;

public class Ricorsione {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = fattoriale(130);
		System.out.println(num);

	}

	public static int fattoriale(int n) {

		if (n % 2 != 0) {
			return 0;

		} else {
			return 1 + fattoriale(n / 2);
		}

	}
}
