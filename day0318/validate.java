package day0318;

import java.util.Scanner;

public class validate {
	/*
	 * ������ ���ϱ�
	 */
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int result = 0;
	for(int i=1; i<=5;i++){
		int a=sc.nextInt();
		result+=(int)Math.pow(a, 2);
	}
	System.out.println(result%10);
}
}
