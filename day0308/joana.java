package day0308;

import java.util.Scanner;
/*
 * ũ�Ⱑ �ȸ��� �ϱ�Ⱦ� ���ҷ�
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
