package day0406;

import java.util.Scanner;

public class bubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		int a[] = new int[a1];
		int i, j, temp, size;
		for (int k = 0; k < a1; k++) {
			a[k] = sc.nextInt();
		}
		size = a.length; // size 8이므로 -1부터 시작
		for (i = size - 1; i > 0; i--) {
			for (j = 0; j < i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
			for (int k = 0; k < size; k++) {
				System.out.print(a[k] + " ");
			
			
			}
			System.out.println();
		}

	}
}
