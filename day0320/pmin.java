package day0320;

import java.util.Scanner;

/*
 * 최소값의 위치 출력
 */
public class pmin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b[] = new int[a];
		for (int i = 0; i < a; i++) {
			b[i] = sc.nextInt();
		}
		int minvalue = 10000;
		for (int i = 0; i < b.length; i++) {
			if (minvalue > b[i]) {
				minvalue = b[i];
			}
		}
		for (int i = 0; i < b.length; i++) {
			if (minvalue == b[i]) {
				System.out.print(i+1+" " );
			}
		}

	}
}
