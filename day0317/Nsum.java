package day0317;

import java.util.Scanner;
//N�� �־��� ���⼭ N �� 1���� M������ �� M�� ���ض�
public class Nsum {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int m; int n;
	m=sc.nextInt();
	n=(int) Math.sqrt(2*m); //int �� �����κ� �Ҽ��� ����!!
	/*
	 * M = N*(N+1)/2 ���Ŀ��� �纯�� 2�� ���ϸ�
	 * 2M =N^2+N �纯�� ��Ʈ�� �����
	 * N<SQRT(2M)<N+0.5
	 * N=SQRT(2*M)
	 */
	System.out.println(n);
	}
}
