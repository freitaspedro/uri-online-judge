package uri;

import java.util.Scanner;

public class P1019 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		int hh = s / 3600;
		int mm = s % 3600 / 60;
		int ss = s % 60;
		System.out.printf("%d:%d:%d\n", hh, mm, ss);
	}

}
