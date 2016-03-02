package day0310;

import java.util.Scanner;
/*
 * 일차 방정식 근의조건
 */
public class equation {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b,c,d;
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	d=sc.nextInt();
	if(a+b-c-d==0){
		System.out.println("many");
	}
	else if(a-c==0){
		System.out.println("none");
	}
	else {
		System.out.printf("%.3f",(float)(d-b)/(a-c));
	}
}
}
