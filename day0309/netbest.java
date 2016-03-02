package day0309;

import java.util.Scanner;
/*
 * 부분집합 구하기 A->B 일 떄 부분집합의 수는 B^A승
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
