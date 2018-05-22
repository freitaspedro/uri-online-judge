package uri;

import java.util.Scanner;

public class P1011 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double raio = scan.nextDouble();
		double volume = (4.0/3.0) * 3.14159 * Math.pow(raio, 3);		
		System.out.printf("VOLUME = %.3f", volume);
		System.out.println();
	}

}
