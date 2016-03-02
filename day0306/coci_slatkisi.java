package day0306;

import java.util.Scanner;
/*
 * 내가가진 최소단뒤로 돈지불 인트는 반올림 소수 없음 
 */
public class coci_slatkisi {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		int a1;
		a1=(int)Math.pow(10,b);
		
	System.out.println((a+a1/2)/a1*a1); //반올림 하는것 내가 가진것에 대한 최소단위를 이용해서
	
		
	}
}
