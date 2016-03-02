package day0317;

import java.util.Scanner;
/*
 *  두 수의 사이수
 */
public class seq {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b;
	a=sc.nextInt();
	b=sc.nextInt();
	int temp;
	if(a>b){
		temp =a;
		a=b;
		b=temp;
	}
	for(int i=a; i<=b;i++){
		System.out.print(i+" ");
	}
}
}
