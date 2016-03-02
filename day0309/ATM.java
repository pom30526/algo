package day0309;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		float b;
		a = sc.nextInt();
		b = sc.nextFloat();
		if (a % 5 != 0) {
			System.out.printf("%.2f", b);
		} else if (a <= b-0.5 && a % 5 == 0) {
			System.out.printf("%.2f", (b - 0.5) - a);
		}else{
			System.out.printf("%.2f",b);
			
		}

	}
}
