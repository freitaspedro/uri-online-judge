package uri;

import java.util.Scanner;

public class P1010 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cod1 = scan.nextInt();
		int qtd1 = scan.nextInt();
		double val1 = scan.nextDouble();	
		int cod2 = scan.nextInt();
		int qtd2 = scan.nextInt();
		double val2 = scan.nextDouble();
		double total = qtd1 * val1 + qtd2 * val2;		
		System.out.printf("VALOR A PAGAR: R$ %.2f ", total);
		System.out.println();
	}

}
