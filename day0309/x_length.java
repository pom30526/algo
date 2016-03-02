package day0309;

import java.util.Scanner;
/*
 * 곡선과 직선 구하기
 */
public class x_length {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b;
	a=sc.nextInt();
	b=sc.nextInt();
	float c;
	c=3.14159f;
	double result=(a+b)*c+(a+b)*Math.sqrt(2);
	System.out.printf("%.3f",result);
}
}
