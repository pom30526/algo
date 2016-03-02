package day0310;

import java.util.Scanner;

public class example_switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();

		if (b == 1 || b == 3 || b == 5 || b == 7 || b == 8 || b == 10
				|| b == 12) {
			System.out.println(31);
		} else if (b == 4 || b == 6 || b == 9 || b == 11) {
			System.out.println(30);
		} else {
			if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0 ) {
				System.out.println(29);
			} else {
				System.out.println(28);
			}
		}
	}
}
