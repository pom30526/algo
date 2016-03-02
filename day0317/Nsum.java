package day0317;

import java.util.Scanner;
//N이 주어짐 여기서 N 은 1부터 M까지의 합 M을 구해라
public class Nsum {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int m; int n;
	m=sc.nextInt();
	n=(int) Math.sqrt(2*m); //int 는 정수부분 소수가 없다!!
	/*
	 * M = N*(N+1)/2 공식에서 양변에 2를 곱하면
	 * 2M =N^2+N 양변에 루트를 씌우면
	 * N<SQRT(2M)<N+0.5
	 * N=SQRT(2*M)
	 */
	System.out.println(n);
	}
}
