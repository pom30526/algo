package day0309;

import java.util.Scanner;
/*
 * �κ����� ���ϱ� A->B �� �� �κ������� ���� B^A��
 */
public class netbest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b;
	a=sc.nextInt();
	b=sc.nextInt();
	long result;
	result=(long) Math.pow(b, a);
	System.out.println(result);
}
}
