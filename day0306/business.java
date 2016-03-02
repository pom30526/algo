package day0306;

import java.util.Scanner;

public class business {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n,m,p,c; //n원가 m정가 p가짜돈 c 거스름돈

	n=sc.nextInt();
	m=sc.nextInt();
	p=sc.nextInt();
	c=sc.nextInt();
	
	//m+c 는 지불 금액 m+c - p 는 진짜돈 //m+c-p -c 는 남는돈 
	int result=(m+c-p-c-n);
	
	System.out.print(-result);
}
}
