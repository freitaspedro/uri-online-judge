package uri;

import java.util.Scanner;

public class P1009 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nome = scan.next();
		double sal = scan.nextDouble();		
		double vendas = scan.nextDouble();
		double total = sal + vendas * 0.15; 
		System.out.printf("TOTAL = R$ %.2f", total);
		System.out.println();
	}

}
