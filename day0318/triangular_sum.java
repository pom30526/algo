package day0318;

import java.util.Scanner;

public class triangular_sum {
	/*
	 * �ﰢ���� �� ����
	 */
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
	int result =0;
	for(int i=1; i<=a;i++){
		result += i*(i+1)*(i+2)/2; //�ﰢ���� ����
			
	}
	System.out.println(result);
}
}
