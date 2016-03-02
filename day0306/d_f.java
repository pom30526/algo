package day0306;

import java.util.Scanner;
/*
 * 정수 소수부 출력
 */
public class d_f {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a,c;
		int b;
		a = sc.nextFloat();//실수값
		b = (int) a; //정수부
		c = a - b;  //소수부
		if(c<0){   //음수에대한것
			c=c+1;
			b=b-1;
		}
		System.out.printf("%d %.2f", b, c);
	}
}
