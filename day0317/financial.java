package day0317;

import java.util.Scanner;
/*
 * 평균 수익구하기
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
