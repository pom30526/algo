package day0309;

import java.util.Scanner;

public class calorie {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, d;

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		int sum = 0;
		if (a == 1) {
			sum += 461;
		} else if (a == 2) {
			sum += 431;
		} else if (a == 3) {
			sum += 420;
		} else {
			sum += 0;
		}

		if (b == 1) {
			sum += 130;
		} else if (b == 2) {
			sum += 160;
		} else if (b == 3) {
			sum += 118;
		} else {
			sum += 0;
		}

		if (c == 1) {
			sum += 100;
		} else if (c == 2) {
			sum += 57;
		} else if (c == 3) {
			sum += 70;
		} else {
			sum += 0;
		}

		if (d == 1) {
			sum += 167;
		} else if (d == 2) {
			sum += 266;
		} else if (d == 3) {
			sum += 75;
		} else {
			sum += 0;
		}
		System.out.println("Your total Calorie count is " + sum+".");

	}
}
