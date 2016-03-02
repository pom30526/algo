package day0317;

import java.util.Scanner;
/*
 * 7개의 수중 홀수를 찾고 홀수의 합과 최소값을 구해야하는문제
 */
public class odd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int sum = 0;
		int minvalue = 10000;

		for (int i = 0; i < 7; i++) {
			a = sc.nextInt();

			if (a % 2 == 1) {
				sum += a;
				if (a < minvalue) {
					minvalue = a;
				}
			}

		}
		if (minvalue != 10000) {
			System.out.println(sum);
			System.out.println(minvalue);
		} else {
			System.out.println(-1);
		}
	}
}
