package day0318;

import java.util.Scanner;

/*
 *  소수 판명 문제
 */
public class prime {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
	int count =0;
	for(int i=2;i<=a;i++){
		if(a%i==0){
			count++;
		}
	}
	if(count==1){
		System.out.println("prime");
	}
	else{
		System.out.println("not prime");
	}
}
}
