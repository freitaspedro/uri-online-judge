package uri;

import java.util.Scanner;

public class P1008 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int h = scan.nextInt();
		double sh = scan.nextDouble();
		System.out.println("NUMBER = " + num);
		System.out.printf("SALARY = U$ %.2f", sh * h);
		System.out.println();
	}

}
