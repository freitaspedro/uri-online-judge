package uri;

import java.util.Scanner;

public class P1005 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();		
		double media = (a * 3.5 + b * 7.5) / 11.0;		
		System.out.printf("MEDIA = %.5f", media);
		System.out.println();
	}

}
