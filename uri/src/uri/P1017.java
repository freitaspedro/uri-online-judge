package uri;

import java.util.Scanner;

public class P1017 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tempo = scan.nextInt();
		int velocidade = scan.nextInt();
		System.out.printf("%.3f\n", tempo * velocidade / 12.0);
	}

}
