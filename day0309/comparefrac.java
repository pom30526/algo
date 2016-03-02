package day0309;

import java.util.Scanner;
/*
 * 분수 크기비교문제
 */
public class comparefrac {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b,c,d;
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	d=sc.nextInt();
			
	if((a*d-b*c > 0)){
		System.out.println(1);
	}

	else if ((a*d-b*c == 0)){
		System.out.println(0);
	}
	else{
		System.out.println(-1);
	}
}
}
