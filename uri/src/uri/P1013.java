package uri;

import java.util.Scanner;

public class P1013 {

	public static int maior(int a, int b) {		
		return ((a + b + Math.abs(a - b)) / 2);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();				
		System.out.printf("%d eh o maior\n", maior(c, maior(a , b)));
	}

}
