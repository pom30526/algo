package day0317;

import java.util.Scanner;
/*
 * ������ϴ� ���α׷�
 */
public class factor {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
	for(int i=1; i<=a;i++){
		if(a%i==0){
			System.out.println(i);
		}
	}
}
}
