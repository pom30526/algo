package day0308;

import java.util.Scanner;
/*
 * 크기가 안맞음 하기싫어 안할래
 */
public class joana {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a;
	a=sc.nextInt();
	
	long  result=3*((a*a+2*a-1)/2)-6;
	
	System.out.println(result);
	
}
}
