package uri;

import java.util.Scanner;

public class P1020 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int d = scan.nextInt();
		int anos = d / 365;
		int meses = d % 365 / 30;
		int dias = (d % 365) % 30;
		System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", anos, meses, dias);

	}

}
