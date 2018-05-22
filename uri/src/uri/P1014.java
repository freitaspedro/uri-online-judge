package uri;

import java.util.Scanner;

public class P1014 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		float y = scan.nextFloat();
		System.out.printf("%.3f km/l\n", x / y);
	}

}
