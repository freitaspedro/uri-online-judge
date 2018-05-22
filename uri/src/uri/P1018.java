package uri;

import java.util.Scanner;

public class P1018 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] notas = {100, 50, 20, 10, 5, 2, 1};
		System.out.println(n);
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("%d nota(s) de R$ %d,00\n", n / notas[i], notas[i]);
			n = n % notas[i];
		}
	}

}
