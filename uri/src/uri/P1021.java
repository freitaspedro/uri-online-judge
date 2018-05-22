package uri;

import java.util.Scanner;

public class P1021 {

	public static void main(String[] args) {		 
		Scanner scan = new Scanner(System.in);
		double n = scan.nextDouble();
		double[] notas = {100.0, 50.0, 20.0, 10.0, 5.0, 2.0};
		double[] moedas = {1.0, 0.5, 0.25, 0.10, 0.05, 0.01};		
		System.out.println("NOTAS:");
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("%d nota(s) de R$ %.2f\n", (int) (n / notas[i]), notas[i]);
			n = n % notas[i];
		}
		System.out.println("MOEDAS:");
		for (int j = 0; j < moedas.length; j++) {
			System.out.printf("%d moeda(s) de R$ %.2f\n", (int) (n / moedas[j]), moedas[j]);
			n = n % moedas[j];
		}
	}

}
