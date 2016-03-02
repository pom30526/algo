package day0319;

import java.util.Scanner;

public class cha2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b,temp;
	a=sc.nextInt();
	b=sc.nextInt();
	System.out.print(a+" "+b+" ");
	while(a-b>=0){
		temp =a;
		a=b;
		b=temp-b;
		System.out.print(b+" ");
	}
}
}
