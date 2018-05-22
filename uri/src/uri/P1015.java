package uri;

import java.util.Scanner;

public class P1015 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float x1 = scan.nextFloat();
		float y1 = scan.nextFloat();
		float x2 = scan.nextFloat();
		float y2 = scan.nextFloat();
		System.out.printf("%.4f\n", Math.sqrt(Math.pow(x2 - x1, 2) + (Math.pow(y2 - y1, 2))));
	}

}
