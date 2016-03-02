package day0317;

import java.util.Scanner;

public class adigit {
	/*
	 * 각 자릿수 별로 더하기
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number[] = new int[7];
		int a;
		int one = 0;
		int ten = 0;
		int hund = 0;

		for (int i = 0; i <= 6; i++) {
			a = sc.nextInt();
			if (a < 10) {
				one += a;
			} else if (a < 100) {
				ten += a;
			} else {
				hund += a;
			}

		}
		System.out.printf("%d %d %d", one, ten, hund);

	}
}