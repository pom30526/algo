package day0413;

import java.util.Scanner;
/*
 * 두수의 최대공약수 구하기
 */
public class euclid {
	public static double euclid(double a, double b){
		double r;
		while (b!=0){
			r=a%b;
			a=b;
			b=r;
		}
		return a;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double a=sc.nextInt();
	double b=sc.nextInt();
	System.out.print((int)euclid(a, b)+" ");
	System.out.print((long)(a*b)/(long)euclid(a, b));
}
}