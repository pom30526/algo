package day0317;

import java.util.Scanner;
/*
 * ��� ���ͱ��ϱ�
 */
public class financial {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double a; double sum=0;
	for(int i=0; i<12;i++){
		a=sc.nextDouble();
		sum += a;
	}
	double average=sum/12;
	System.out.printf("$%.2f",average);
	
}
}
