package uri;

import java.util.Scanner;

public class P1002 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double raio = scan.nextDouble();		
		double area = 3.14159 * Math.pow(raio, 2);		
		System.out.printf("A=%.4f", area);
		System.out.println();
	}

}
