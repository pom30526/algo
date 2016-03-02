package day0402;

import java.util.Scanner;

/*
 * 군수열의 합
 */
public class gseries {
	int sum = 0;

	public int req(int i) {
		if (i == 1) {
			return sum += 1;
		} else {
			for (int j = 1; j <= i; j++) {
				sum += j;
			}
		}
		return req(i - 1);
	}

	public int getsum() {
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		gseries b = new gseries();
		b.req(a);
		System.out.println(b.getsum());

	}
}
